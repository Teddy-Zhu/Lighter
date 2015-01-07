package troevil.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import troevil.interfaces.MembersI;
import troevil.interfaces.MemlimitI;
import troevil.interfaces.MemstatusI;
import troevil.interfaces.MemtypeI;
import troevil.model.Members;
import troevil.model.Result;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/members")
public class MemController extends CommonController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MemController.class);
	@Inject
	private MembersI memberService;
	@Inject
	private MemtypeI memtypeService;
	@Inject
	private MemlimitI memlimitService;
	@Inject
	private MemstatusI memstatusSerice;

	@Inject
	private HttpServletRequest request;

	@RequestMapping("/{username}/{password}/login")
	public String login(@PathVariable String username, @PathVariable String password, String logintype, Integer Cookies) {
		request.getSession().removeAttribute("username");
		Result result = new Result(1);
		List<String> reasons = new ArrayList<String>();
		if (CheckNull(username) || CheckNull(password))
			reasons.add(Sformat2(Error_null, Name_or, Name_username, Name_password));
		if (CheckNull(logintype))
			reasons.add(Sformat(Error_null, Login_usertype));
		if (!logintype.equals("Email") && !logintype.equals("Nick"))
			reasons.add(Sformat(Error_none, Login_usertype));
		if (CheckNull(Cookies))
			reasons.add(Name_cookies + Error_cate);
		if (!reasons.isEmpty()) {
			result.setloginfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		logintype = logintype.toLowerCase();
		Members member = memberService.verifySelective(logintype, username, password);
		if (member == null) {
			reasons.add(Sformat(Name_or, Sformat(Error_none, Name_username), Sformat(Error_error, Name_password)));
			reasons.add(Sformat(Name_yourinput, Name_username) + Sformat(Name_sem, logintype, username) + Sformat(Name_sem, Name_password, password));
			reasons.add(Sformat2(Warning_check, Error_error, Name_input));
			result.setloginfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		Members inmember = new Members();
		inmember = memberService.selectByuserid(member.getUserid());
		logger.info(JSON.toJSON(inmember));
		if (inmember.getLimitid() == null) {
			if (inmember.getMemtype().getTypestatus().getForbit() == 1)
				reasons.add(Sformat(Name_or, Sformat2(Warning_sorry, Name_yourinput, Name_username), member.getNick() + Sformat(Operate_already, Name_forbit)));
		} else {
			if (inmember.getMemlimit().getLimitstatus().getForbit() == 1)
				reasons.add(Sformat(Name_or, Sformat2(Warning_sorry, Name_yourinput, Name_username), member.getNick() + Sformat(Operate_already, Name_forbit)));
		}

		if (!reasons.isEmpty()) {
			result.setloginfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		String session = Long.toString(System.currentTimeMillis());
		member.setSession(session);
		member.setLastip(request.getRemoteAddr());
		if (memberService.updateMember(member) == 1) {
			if (inmember.getLimitid() == null) {
				if (inmember.getMemtype().getTypestatus().getName().equals(Name_check)) {
					member.setNick(member.getNick() + "(" + Name_check + ")");
				}
			} else {
				if (inmember.getMemlimit().getLimitstatus().getName().equals(Name_check)) {
					member.setNick(member.getNick() + "(" + Name_check + ")");
				}
			}
			request.getSession().setAttribute("username", member.getUserid().toString());
			request.getSession().setAttribute("nick", member.getNick());
			request.getSession().setMaxInactiveInterval(Cookies * 60);
			result.setloginsuccess(member, inmember.getMemtype().getTypename());
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		} else {
			reasons.add(Error_datebase);
			reasons.add(Name_response);
		}

		result.setloginfail(reasons);
		request.getSession().setAttribute("result", result);
		return "results/opresult";
	}

	@RequestMapping("/logout")
	public String logout() {// ModelAndView also return new
							// ModelAndView("/redirect:/index.jsp")
		request.getSession().removeAttribute("username");
		request.removeAttribute("username");
		return "redirect:/";
	}

	@RequestMapping("/register")
	public String register(String regemail_pre, String regemail_suf, String regnick, Integer regtypeid, String regpassword, String reregpassword, Integer sex, String regphone) {
		Members regmem = new Members();
		List<String> reasons = new ArrayList<String>();
		Result result = new Result(2);
		if (CheckNull(regemail_pre) && CheckNull(regemail_suf))
			reasons.add(Sformat(Error_null, Name_email));
		if (!Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$").matcher(regemail_pre + "@" + regemail_suf).find())
			reasons.add(Sformat2(Error_regx, Error_format, Name_email));
		if (CheckNull(regnick))
			reasons.add(Sformat(Error_null, Name_nick));
		if (regtypeid == null || memtypeService.getByPrimaryKey(regtypeid) == null)
			reasons.add(Sformat(Error_null, Name_usertype));
		else if (memtypeService.getByPrimaryKey(regtypeid).getAllowreg() == 0)
			reasons.add(Sformat(Error_error, Name_usertype));
		if (!regpassword.equals(reregpassword))
			reasons.add(Error_duplicatepass);
		if (CheckNull(regpassword))
			reasons.add(Sformat(Error_null, Name_password));
		if (sex != 1 && sex != 0)
			reasons.add(Sformat(Error_null, Name_sex));
		if (CheckNull(regphone))
			reasons.add(Sformat(Error_null, Name_phone));
		if (!Pattern.compile("1[3,4,5,7,8]{1}\\d{9}").matcher(regphone).find())
			reasons.add(Sformat(Error_nottrue, Sformat2(Error_format, Name_yourinput, Name_phone)));
		if (memberService.selectRepeat("email", regemail_pre + "@" + regemail_suf) != null)
			reasons.add(Sformat2(Warning_sorry, Sformat(Name_yourinput, Name_email) + Sformat(Operate_already, Name_registerd)));
		if (memberService.selectRepeat("nick", regnick) != null)
			reasons.add(Sformat2(Warning_sorry, Sformat(Name_yourinput, Name_nick) + Sformat(Operate_already, Name_used)));
		if (!reasons.isEmpty()) {
			result.setregfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		regmem.setEmail(regemail_pre + "@" + regemail_suf);
		regmem.setHot(0);
		regmem.setLastip(request.getRemoteAddr());
		regmem.setNick(regnick);
		regmem.setPassword(regpassword);
		regmem.setRegdate(new Date());
		regmem.setTypeid(regtypeid);
		regmem.setPhone(regphone);
		if (memberService.registernewmember(regmem) == 1) {
			reasons.add(Sformat(Success_welcome, regnick, Name_thanksforregiter));
			result.setregsuccess(reasons);
			request.getSession().setAttribute("result", result);
		} else {
			reasons.add(Sformat(Warning_sorry, Sformat(Error_failed, Name_registerd) + Error_unknown));
			reasons.add(Name_returns);
			result.setregfail(reasons);
			request.getSession().setAttribute("result", result);
		}
		return "results/opresult";
	}

	@RequestMapping("/{field}/{type}/verifyrepat")
	public @ResponseBody boolean verifyemail(@PathVariable String field, @PathVariable Integer type) {
		String typename = "";
		switch (type) {
		case 1: {
			typename = "email";
			break;
		}
		case 2: {
			typename = "nick";
			break;
		}
		default: {
			typename = "email";
			break;
		}
		}
		if (memberService.selectRepeat(typename, field) == null)
			return true;
		return false;
	}
}
