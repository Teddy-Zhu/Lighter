package troevil.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import troevil.interfaces.ArticlesI;
import troevil.interfaces.ClassifyStatusI;
import troevil.interfaces.LinksI;
import troevil.interfaces.MembersI;
import troevil.interfaces.PublicinfoI;
import troevil.interfaces.SettingsI;
import troevil.model.Article;
import troevil.model.Publicinfo;
import troevil.model.Settings;

@Controller
@RequestMapping("/")
public class DefaultController extends CommonController {
	private ArticlesI articleService;
	private MembersI memberService;
	private ClassifyStatusI classifyService;
	private HttpServletRequest request;
	private SettingsI settingService;
	private PublicinfoI publicinfoService;
	private LinksI linksService;

	public LinksI getLinksService() {
		return linksService;
	}

	@Autowired
	public void setLinksService(LinksI linksService) {
		this.linksService = linksService;
	}

	public PublicinfoI getPublicinfoService() {
		return publicinfoService;
	}

	@Autowired
	public void setPublicinfoService(PublicinfoI publicinfoService) {
		this.publicinfoService = publicinfoService;
	}

	public MembersI getMemberService() {
		return memberService;
	}

	@Autowired
	public void setMemberService(MembersI memberService) {
		this.memberService = memberService;
	}

	public SettingsI getSettingService() {
		return settingService;
	}

	@Autowired
	public void setSettingService(SettingsI settingService) {
		this.settingService = settingService;
	}

	public ClassifyStatusI getClassifyService() {
		return classifyService;
	}

	@Autowired
	public void setClassifyService(ClassifyStatusI classifyService) {
		this.classifyService = classifyService;
	}

	public ArticlesI getArticleService() {
		return articleService;
	}

	@Autowired
	public void setArticleService(ArticlesI articleService) {
		this.articleService = articleService;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	@Autowired
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@RequestMapping("index")
	public String index() {
		Settings pagesizeset = settingService.getsettingbyname("pagesize");
		Integer pagesize = pagesizeset.getValue();
		List<Article> lists = articleService.getAllArticle(Articles_arpub, 0, pagesize);
		List<Publicinfo> pubinfo = publicinfoService.getAllpublicinfo(0, 5);
		request.getSession().setAttribute("totle",
				articleService.getnumber(Articles_arpub));
		request.getSession().setAttribute("lists", lists);
		request.getSession().setAttribute("publicinfo", pubinfo);
		request.getSession().setAttribute("publicnum",
				publicinfoService.getnumber());
		request.getSession().setAttribute("links", linksService.getAlllinks(1));
		request.getSession().setAttribute("linknum", linksService.getnumber(1));
		return "models/index";
	}

	@RequestMapping("Settings")
	public String Setting() {

		return "models/Settings";
	}
}
