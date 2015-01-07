package troevil.model;

public class Memlimit {
	private Integer limitid;

	private Integer daily;

	private Integer status;

	private Memstatus limitstatus;

	public Memstatus getLimitstatus() {
		return limitstatus;
	}

	public void setLimitstatus(Memstatus limitstatus) {
		this.limitstatus = limitstatus;
	}

	public Integer getLimitid() {
		return limitid;
	}

	public void setLimitid(Integer limitid) {
		this.limitid = limitid;
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
}