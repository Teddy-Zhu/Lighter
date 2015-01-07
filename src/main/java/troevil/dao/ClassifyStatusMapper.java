package troevil.dao;

import java.util.List;

import troevil.model.ClassifyStatus;

public interface ClassifyStatusMapper {
	int deleteByPrimaryKey(Integer classifyid);

	int insert(ClassifyStatus record);

	int insertSelective(ClassifyStatus record);

	ClassifyStatus selectByPrimaryKey(Integer classifyid);

	List<ClassifyStatus> getallclassify();

	int updateByPrimaryKeySelective(ClassifyStatus record);

	int updateByPrimaryKey(ClassifyStatus record);
}