package troevil.controller;

import java.util.List;

import javax.inject.Inject;
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
	@Inject
	private ArticlesI articleService;
	@Inject
	private MembersI memberService;
	@Inject
	private ClassifyStatusI classifyService;
	@Inject
	private HttpServletRequest request;
	@Inject
	private SettingsI settingService;
	@Inject
	private PublicinfoI publicinfoService;
	@Inject
	private LinksI linksService;

	@RequestMapping("index")
	public String index() {
		Settings pagesizeset = settingService.getsettingbyname("pagesize");
		Integer pagesize = pagesizeset.getValue();
		List<Article> lists = articleService.getAllArticle(Articles_arpub, 0, pagesize);
		List<Publicinfo> pubinfo = publicinfoService.getAllpublicinfo(0, 5);
		request.getSession().setAttribute("totle", articleService.getnumber(Articles_arpub));
		request.getSession().setAttribute("lists", lists);
		request.getSession().setAttribute("publicinfo", pubinfo);
		request.getSession().setAttribute("publicnum", publicinfoService.getnumber());
		request.getSession().setAttribute("links", linksService.getAlllinks(1));
		request.getSession().setAttribute("linknum", linksService.getnumber(1));
		return "models/index";
	}

	@RequestMapping("Settings")
	public String Setting() {

		return "models/Settings";
	}
}
