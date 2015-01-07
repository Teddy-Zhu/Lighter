package troevil.model;

public class Visitors extends VisitorsKey {
	private String email;

	private Integer typeid;

	private String session;

	private String lastip;

	private Integer allow;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
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

	public Integer getAllow() {
		return allow;
	}

	public void setAllow(Integer allow) {
		this.allow = allow;
	}
}