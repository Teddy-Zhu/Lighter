package troevil.model;

public class VisitorsKey {
	private Integer vistitorid;

	private String nick;

	public Integer getVistitorid() {
		return vistitorid;
	}

	public void setVistitorid(Integer vistitorid) {
		this.vistitorid = vistitorid;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick == null ? null : nick.trim();
	}
}