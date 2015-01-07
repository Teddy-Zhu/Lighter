package troevil.model;

public class Logtype {
	private Integer logtype;

	private String name;

	public Integer getLogtype() {
		return logtype;
	}

	public void setLogtype(Integer logtype) {
		this.logtype = logtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}