package troevil.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import troevil.interfaces.ArticlesI;
import troevil.interfaces.ClassifyStatusI;
import troevil.interfaces.MembersI;
import troevil.interfaces.MemlimitI;
import troevil.interfaces.MemtypeI;
import troevil.interfaces.PublicinfoI;
import troevil.interfaces.SettingsI;
import troevil.model.Article;
import troevil.model.Members;
import troevil.model.Memlimit;
import troevil.model.Publicinfo;
import troevil.model.Result;
import troevil.model.Settings;

@Controller
@RequestMapping("/articles")
public class ArticleController extends CommonController {

	@Inject
	private MembersI memberService;
	@Inject
	private ArticlesI articleService;
	@Inject
	private ClassifyStatusI classifyService;
	@Inject
	private HttpServletRequest request;
	@Inject
	private SettingsI settingService;
	@Inject
	private MemlimitI memlimitService;
	@Inject
	private MemtypeI memtypeService;
	@Inject
	private PublicinfoI publicinfoService;

	public Result result;

	@RequestMapping("/{nowpage}/getrecent")
	public String ajaxgetarticle(@PathVariable Integer nowpage) {
		Settings pagesize = settingService.getsettingbyname("pagesize");
		Integer size = pagesize.getValue();
		List<Article> lists = articleService.getAllArticle(Articles_arpub,
				(nowpage - 1) * size, size);
		if (lists.size() == 0)
			return "models/empty";
		request.getSession().setAttribute("lists", lists);
		return "models/articlesmodel";
	}

	@RequestMapping("/publishart")
	public String publisharticle(String artcontext, String arttitle,
			Integer artclassify) {
		List<String> reasons = new ArrayList<String>();
		result = new Result(3);
		if (request.getSession().getAttribute("username") == null)
			reasons.add(Error_nologin);
		else if (CheckNull(request.getSession().getAttribute("username")
				.toString()))
			reasons.add(Error_nologin);
		if (artclassify == null
				|| classifyService.selectbyid(artclassify) == null)
			reasons.add(Sformat(Error_selectcate, Name_articles));
		if (CheckNull(arttitle))
			reasons.add(Sformat2(Error_null, Name_title, Name_articles));
		if (CheckNull(artcontext))
			reasons.add(Sformat2(Error_null, Name_content, Name_articles));

		Members mem = new Members();
		mem = memberService.selectByuserid(Integer.parseInt(request
				.getSession().getAttribute("username").toString()));
		if (mem != null) {
			if (mem.getLimitid() == null) {
				if (mem.getMemtype().getDaily() <= 0)
					reasons.add(Sformat2(Warning_noaccess, Operate_publish,
							Name_articles));
				if (mem.getMemtype().getTypestatus().getName()
						.equals(Name_check))
					reasons.add(Sformat2(Warning_noaccess, Operate_publish,
							Name_articles) + Sformat(Need_check, Need));
			} else {
				if (mem.getMemlimit().getDaily() <= 0)
					reasons.add(Sformat2(Warning_noaccess, Operate_publish,
							Name_articles));
				if (mem.getMemlimit().getLimitstatus().getName()
						.equals(Name_check))
					reasons.add(Sformat2(Warning_noaccess, Operate_publish,
							Name_articles) + Sformat(Need_check, Need));
			}
		} else
			reasons.add(Error_nologin);
		if (!reasons.isEmpty()) {
			result.setpubfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		Article newpost = new Article();
		newpost.setTitle(arttitle);
		newpost.setTextarea(artcontext);
		newpost.setClassifyid(artclassify);
		Date last = new Date();
		newpost.setPubdate(last);
		newpost.setLastedit(last);
		newpost.setArticlestatus(2);
		newpost.setUserid(Integer.parseInt(request.getSession()
				.getAttribute("username").toString()));
		if (articleService.insertarticle(newpost) != 1) {
			reasons.add(Error_datebase);
			result.setpubfail(reasons);
		} else {
			if (mem.getLimitid() == null) {

				Memlimit insertlimit = new Memlimit();
				insertlimit.setDaily(mem.getMemtype().getDaily() - 1);
				insertlimit.setStatus(mem.getMemtype().getStatus());
				memlimitService.insertlimitid(insertlimit);
				mem.setLimitid(insertlimit.getLimitid());
				memberService.updateMember(mem);
			} else {
				mem.getMemlimit().setDaily(mem.getMemlimit().getDaily() - 1);
				memlimitService.updateselect(mem.getMemlimit());
			}
			reasons.add(Sformat(Success_operation, Sformat(Operate_publish, Name_articles)+ arttitle));
			result.setpubsuccess(reasons);
		}
		request.getSession().setAttribute("result", result);
		return "results/opresult";
	}

	@RequestMapping("/publishno")
	public String announcement(String pubcontext) {
		List<String> reasons = new ArrayList<String>();
		result = new Result(4);
		Members mem = new Members();
		if (request.getSession().getAttribute("username") != null) {
			mem = memberService.selectByuserid(Integer.parseInt(request
					.getSession().getAttribute("username").toString()));
			if (mem != null) {
				if (mem.getLimitid() == null) {
					if (!mem.getMemtype().getTypestatus().getName()
							.equals(Name_superaccess))
						reasons.add(Sformat2(Warning_noaccess,
								Operate_publish_2, Name_announcement));
				} else {
					if (!mem.getMemlimit().getLimitstatus().getName()
							.equals(Name_superaccess))
						reasons.add(Sformat2(Warning_noaccess,
								Operate_publish_2, Name_announcement));
				}
			} else
				reasons.add(Error_datebase);
		} else
			reasons.add(Error_nologin);
		if (CheckNull(pubcontext))
			reasons.add(Sformat2(Error_null, Name_content, Name_announcement));
		if (!reasons.isEmpty()) {
			result.setpubnofail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		Publicinfo record = new Publicinfo();
		record.setContext(pubcontext);
		record.setPubtime(new Date());
		record.setUserid(Integer.parseInt(request.getSession()
				.getAttribute("username").toString()));
		if (publicinfoService.insertnewselective(record) == 1)
			reasons.add(Sformat2(Success_operation, Operate_publish_2,
					Name_announcement));
		else {
			reasons.add(Error_datebase);
			result.setpubnofail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		result.setpubnosuccess(reasons);
		request.getSession().setAttribute("result", result);
		return "results/opresult";
	}
}
