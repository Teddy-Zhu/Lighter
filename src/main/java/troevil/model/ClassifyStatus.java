package troevil.model;

public class ClassifyStatus {
	private Integer classifyid;

	private String name;

	private Integer preclassifyid;

    private Integer enable;

    private Integer display;

    public Integer getClassifyid() {
        return classifyid;
    }

	public void setClassifyid(Integer classifyid) {
		this.classifyid = classifyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getPreclassifyid() {
		return preclassifyid;
	}

    public void setPreclassifyid(Integer preclassifyid) {
        this.preclassifyid = preclassifyid;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }
}