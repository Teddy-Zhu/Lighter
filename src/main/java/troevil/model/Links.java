package troevil.model;

public class Links {
	private Integer linkid;

	private String linker;

	private String linkname;

	private String linkdetails;

	private String level;

	private Integer enable;

	public Integer getLinkid() {
		return linkid;
	}

	public void setLinkid(Integer linkid) {
		this.linkid = linkid;
	}

	public String getLinker() {
		return linker;
	}

	public void setLinker(String linker) {
		this.linker = linker == null ? null : linker.trim();
	}

	public String getLinkname() {
		return linkname;
	}

	public void setLinkname(String linkname) {
		this.linkname = linkname == null ? null : linkname.trim();
	}

	public String getLinkdetails() {
		return linkdetails;
	}

	public void setLinkdetails(String linkdetails) {
		this.linkdetails = linkdetails == null ? null : linkdetails.trim();
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level == null ? null : level.trim();
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}
}