package troevil.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import troevil.interfaces.LinksI;
import troevil.model.Links;
import troevil.model.Result;

@Controller
@RequestMapping("/links")
public class LinksController extends CommonController {
	private LinksI linksService;
	private HttpServletRequest request;

	public HttpServletRequest getRequest() {
		return request;
	}

	@Autowired
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public LinksI getLinksService() {
		return linksService;
	}

	@Autowired
	public void setLinksService(LinksI linksService) {
		this.linksService = linksService;
	}

	@RequestMapping("/addlink")
	public String addlink(Integer linkenable, String linklevel,
			String linkname, String linker, String linkdetail) {
		List<String> reasons = new ArrayList<String>();
		Result result = new Result(5);
		if (CheckNull(linkdetail))
			linkdetail = "";
		if (CheckNull(linkname))
			reasons.add(Sformat2(Error_null, Name_content, Name_link));
		if (CheckNull(linker))
			reasons.add(Sformat(Error_null, Name_link));
		if (CheckNull(linklevel))
			reasons.add(Sformat(Error_null, Name_link + Name_level));
		if (!reasons.isEmpty()) {
			result.setaddlinkfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		Links record = new Links();
		record.setEnable(linkenable);
		record.setLevel(linklevel);
		record.setLinkdetails(linkdetail);
		record.setLinker(linker);
		record.setLinkname(linkname);
		if (linksService.insertSelective(record) == 1)
			reasons.add(Sformat(
					Success_operation,
					Sformat(Operate_add, Name_link)
							+ Sformat(Name_sem, linkname, linker)));
		else {
			reasons.add(Error_datebase);
			result.setaddlinkfail(reasons);
			request.getSession().setAttribute("result", result);
			return "results/opresult";
		}
		result.setaddlinksuccess(reasons);
		request.getSession().setAttribute("result", result);
		return "results/opresult";
	}
}
