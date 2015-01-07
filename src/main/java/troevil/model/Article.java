package troevil.model;

import java.util.Date;

public class Article {

	private ClassifyStatus classifystatus;

	private Members member;

	private Integer articleid;

	private String title;

	private String textarea;

	private Date pubdate;

	private Date lastedit;

	private Integer userid;

	private Integer hot;

	private Integer review;

	private Integer articlestatus;

	private Integer classifyid;

	public ClassifyStatus getClassifystatus() {
		return classifystatus;
	}

	public void setClassifystatus(ClassifyStatus classifystatus) {
		this.classifystatus = classifystatus;
	}

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public Integer getArticleid() {
		return articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
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

	public Date getLastedit() {
		return lastedit;
	}

	public void setLastedit(Date lastedit) {
		this.lastedit = lastedit;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getReview() {
		return review;
	}

	public void setReview(Integer review) {
		this.review = review;
	}

	public Integer getArticlestatus() {
		return articlestatus;
	}

	public void setArticlestatus(Integer articlestatus) {
		this.articlestatus = articlestatus;
	}

	public Integer getClassifyid() {
		return classifyid;
	}

	public void setClassifyid(Integer classifyid) {
		this.classifyid = classifyid;
	}
}