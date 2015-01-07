package troevil.model;

import java.util.ArrayList;
import java.util.List;

import troevil.controller.CommonController;

public class Result extends CommonController {
	private List<String> resultString = new ArrayList<String>();

	private String title;

	private String level;

	private Integer id;

	public Result(Integer id) {
		this.id = id;
		if (id == 1)
			setloginfail(new ArrayList<String>());
		if (id == 2)
			setregfail(new ArrayList<String>());
		if (id == 3)
			setpubfail(new ArrayList<String>());
		if (id == 4)
			setpubnofail(new ArrayList<String>());
		if (id == 5)
			setaddlinkfail(new ArrayList<String>());
	}

	public void setaddlinkfail(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("可能有以下原因:");
		addString(reasons);
		this.title = "添加失败!";
		this.level = "danger";
	}

	public void setaddlinksuccess(List<String> reasons) {
		this.resultString.clear();
		addString(reasons);
		this.title = "添加成功!";
		this.level = "success";
	}

	public void setpubnofail(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("可能有以下原因:");
		addString(reasons);
		this.title = "发布失败!";
		this.level = "danger";
	}

	public void setpubnosuccess(List<String> reasons) {
		this.resultString.clear();
		addString(reasons);
		this.title = "发布成功!";
		this.level = "success";
	}

	public void setloginfail(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("您可以进行以下尝试:");
		addString(reasons);
		this.title = "登陆失败!";
		this.level = "danger";
	}

	public void setloginsuccess(Members m, String usertypename) {
		this.resultString.clear();
		this.resultString.add("尊敬的" + usertypename + m.getNick()
				+ ", 欢迎登录Lighter!");
		this.title = "登陆成功!";
		this.level = "success";
	}

	public void setregfail(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("失败原因:");
		addString(reasons);
		this.title = "注册失败!";
		this.level = "warning";
	}

	public void setregsuccess(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("恭喜您:");
		addString(reasons);
		this.title = "注册成功!";
		this.level = "success";
	}

	public void addString(List<String> reasons) {
		for (int i = 0; i < reasons.size(); i++)
			this.resultString.add("   " + (i + 1) + "." + reasons.get(i));
	}

	public void setpubfail(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("失败原因:");
		addString(reasons);
		this.title = "发布失败!";
		this.level = "danger";
	}

	public void setpubsuccess(List<String> reasons) {
		this.resultString.clear();
		this.resultString.add("恭喜您:");
		addString(reasons);
		this.title = "发表成功!";
		this.level = "success";
	}

	public List<String> getResultString() {
		return resultString;
	}

	public void setResultString(List<String> resultString) {
		this.resultString = resultString;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
