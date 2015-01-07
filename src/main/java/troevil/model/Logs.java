package troevil.model;

import java.util.Date;

public class Logs {
	private Integer logid;

	private String textarea;

	private Date opdate;

	private Integer optype;

	public Integer getLogid() {
		return logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	public String getTextarea() {
		return textarea;
	}

	public void setTextarea(String textarea) {
		this.textarea = textarea == null ? null : textarea.trim();
	}

	public Date getOpdate() {
		return opdate;
	}

	public void setOpdate(Date opdate) {
		this.opdate = opdate;
	}

	public Integer getOptype() {
		return optype;
	}

	public void setOptype(Integer optype) {
		this.optype = optype;
	}
}