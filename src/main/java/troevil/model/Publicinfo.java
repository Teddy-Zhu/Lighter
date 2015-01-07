package troevil.model;

import java.util.Date;

public class Publicinfo {

	private Members member;

	private Integer publicid;

	private String context;

	private Date pubtime;

	private Integer userid;

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public Integer getPublicid() {
		return publicid;
	}

	public void setPublicid(Integer publicid) {
		this.publicid = publicid;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context == null ? null : context.trim();
	}

	public Date getPubtime() {
		return pubtime;
	}

	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}