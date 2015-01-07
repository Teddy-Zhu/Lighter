package troevil.model;

import java.util.Date;

public class Commit {
	private Integer commitid;

	private Integer userid;

	private Integer vistitorid;

	private String textarea;

	private Date pubdate;

	private Integer artstatus;

	private Integer articleid;

	public Integer getCommitid() {
		return commitid;
	}

	public void setCommitid(Integer commitid) {
		this.commitid = commitid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getVistitorid() {
		return vistitorid;
	}

	public void setVistitorid(Integer vistitorid) {
		this.vistitorid = vistitorid;
	}

	public String getTextarea() {
		return textarea;
	}

	public void setTextarea(String textarea) {
		this.textarea = textarea == null ? null : textarea.trim();
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public Integer getArtstatus() {
		return artstatus;
	}

	public void setArtstatus(Integer artstatus) {
		this.artstatus = artstatus;
	}

	public Integer getArticleid() {
		return articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}
}