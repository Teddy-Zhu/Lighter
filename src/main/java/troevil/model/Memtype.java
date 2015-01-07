package troevil.model;

public class Memtype {
	private Integer typeid;

	private String typename;

	private Integer daily;

	private Integer status;

	private Integer allowreg;

	private Memstatus typestatus;

	public Memstatus getTypestatus() {
		return typestatus;
	}

	public void setTypestatus(Memstatus typestatus) {
		this.typestatus = typestatus;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename == null ? null : typename.trim();
	}

	public Integer getDaily() {
		return daily;
	}

	public void setDaily(Integer daily) {
		this.daily = daily;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAllowreg() {
		return allowreg;
	}

	public void setAllowreg(Integer allowreg) {
		this.allowreg = allowreg;
	}
}