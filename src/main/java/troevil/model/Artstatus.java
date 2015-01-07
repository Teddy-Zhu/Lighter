package troevil.model;

public class Artstatus {
	private Integer articlestatus;

	private String name;

	public Integer getArticlestatus() {
		return articlestatus;
	}

	public void setArticlestatus(Integer articlestatus) {
		this.articlestatus = articlestatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}