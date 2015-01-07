package troevil.model;

import java.util.Date;

public class Members {
	private Integer userid;

	private String nick;

	private String email;

	private String password;

	private String phone;

	private Integer typeid;

	private Integer limitid;

	private String session;

	private String lastip;

	private Date regdate;

	private Integer hot;

	private String icon;

	private Memlimit memlimit;

	private Memtype memtype;

	public Memtype getMemtype() {
		return memtype;
	}

	public void setMemtype(Memtype memtype) {
		this.memtype = memtype;
	}

	public Memlimit getMemlimit() {
		return memlimit;
	}

	public void setMemlimit(Memlimit memlimit) {
		this.memlimit = memlimit;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick == null ? null : nick.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getLimitid() {
		return limitid;
	}

	public void setLimitid(Integer limitid) {
		this.limitid = limitid;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session == null ? null : session.trim();
	}

	public String getLastip() {
		return lastip;
	}

	public void setLastip(String lastip) {
		this.lastip = lastip == null ? null : lastip.trim();
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}
}