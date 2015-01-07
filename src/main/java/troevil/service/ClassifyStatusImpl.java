package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.ClassifyStatusMapper;
import troevil.interfaces.ClassifyStatusI;
import troevil.model.ClassifyStatus;

@Service("classifystatusService")
public class ClassifyStatusImpl implements ClassifyStatusI {

	private ClassifyStatusMapper classifystatusMapper;

	public ClassifyStatusMapper getClassifyMapper() {
		return classifystatusMapper;
	}

	@Autowired
	public void setClassifyMapper(ClassifyStatusMapper classifyMapper) {
		this.classifystatusMapper = classifyMapper;
	}

	@Override
	public ClassifyStatus selectbyid(Integer classifyid) {
		return classifystatusMapper.selectByPrimaryKey(classifyid);
	}

	@Override
	public List<ClassifyStatus> getallclassify() {
		return classifystatusMapper.getallclassify();
	}
}
