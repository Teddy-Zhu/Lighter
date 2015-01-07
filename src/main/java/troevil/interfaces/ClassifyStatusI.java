package troevil.interfaces;

import java.util.List;

import troevil.model.ClassifyStatus;

public interface ClassifyStatusI {
	public ClassifyStatus selectbyid(Integer classifyid);

	public List<ClassifyStatus> getallclassify();
}
