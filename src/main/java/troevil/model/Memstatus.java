package troevil.model;

public class Memstatus {
	private Integer statusid;

	private String name;

	private Integer forbit;

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getForbit() {
		return forbit;
	}

	public void setForbit(Integer forbit) {
		this.forbit = forbit;
	}
}