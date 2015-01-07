package troevil.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import troevil.interfaces.ClassifyStatusI;
import troevil.interfaces.MembersI;
import troevil.interfaces.MemtypeI;
import troevil.interfaces.SettingsI;
import troevil.model.ClassifyStatus;
import troevil.model.Members;
import troevil.model.Memtype;
import troevil.model.Settings;

@Controller
@RequestMapping("/models")
public class ModelController extends CommonController {
	@Inject
	private ClassifyStatusI classifyService;
	@Inject
	private HttpServletRequest request;
	@Inject
	private MemtypeI memtypeService;
	@Inject
	private SettingsI settingsService;
	@Inject
	private MembersI memberService;

	@RequestMapping("/register")
	public String regmodel() {
		List<Memtype> list = memtypeService.getmemberregtype(1);
		request.getSession().setAttribute("list", list);
		return "models/regmodel";
	}

	@RequestMapping("/login")
	public String loginmodel() {
		Settings nickset = settingsService.getsettingbyname("nickreg");
		Settings emailset = settingsService.getsettingbyname("emailreg");
		request.getSession().setAttribute("regemail", emailset.getValue());
		request.getSession().setAttribute("regnick", nickset.getValue());
		return "models/loginmodel";
	}

	@RequestMapping("/publishart")
	public String publishmodel() {
		Members mem = new Members();
		request.getSession().setAttribute("allow", 0);
		if (request.getSession().getAttribute("username") != null) {
			mem = memberService.selectByuserid(Integer.parseInt(request.getSession().getAttribute("username").toString()));
			if (mem != null) {
				if (mem.getLimitid() == null) {

					if (mem.getMemtype().getDaily() > 0)
						request.getSession().setAttribute("allow", 1);
					else {
						request.getSession().setAttribute("allow", 0);
						return "models/publishartmodel";
					}
					if (mem.getMemtype().getTypestatus().getName().equals(Name_check))
						request.getSession().setAttribute("allow", 0);
				} else {
					if (mem.getMemlimit().getDaily() > 0)
						request.getSession().setAttribute("allow", 1);
					else {
						request.getSession().setAttribute("allow", 0);
						return "models/publishartmodel";
					}
					if (mem.getMemlimit().getLimitstatus().getName().equals(Name_check))
						request.getSession().setAttribute("allow", 0);
				}
				List<ClassifyStatus> classify = classifyService.getallclassify();
				request.getSession().setAttribute("classify", classify);
			} else
				request.getSession().setAttribute("allow", 0);
		} else
			request.getSession().setAttribute("allow", 0);
		return "models/publishartmodel";
	}

	@RequestMapping("/publishno")
	public String pubinfomodel() {
		Members mem = new Members();
		request.getSession().setAttribute("allow", 0);
		if (request.getSession().getAttribute("username") != null) {
			mem = memberService.selectByuserid(Integer.parseInt(request.getSession().getAttribute("username").toString()));
			if (mem != null) {
				if (mem.getLimitid() == null) {
					if (mem.getMemtype().getTypestatus().getName().equals(Name_superaccess))
						request.getSession().setAttribute("allow", 1);
				} else {
					if (mem.getMemlimit().getLimitstatus().getName().equals(Name_superaccess))
						request.getSession().setAttribute("allow", 1);
				}
			}
		}
		return "models/publishnomodel";
	}

	@RequestMapping("/addlink")
	public String addlinkmodel() {
		Members mem = new Members();
		request.getSession().setAttribute("allow", 0);
		if (request.getSession().getAttribute("username") != null) {
			mem = memberService.selectByuserid(Integer.parseInt(request.getSession().getAttribute("username").toString()));
			if (mem != null) {
				if (mem.getLimitid() == null) {
					if (mem.getMemtype().getTypestatus().getName().equals(Name_superaccess))
						request.getSession().setAttribute("allow", 1);
				} else {
					if (mem.getMemlimit().getLimitstatus().getName().equals(Name_superaccess))
						request.getSession().setAttribute("allow", 1);
				}
			}
		}
		return "models/addlinkmodel";
	}
}
