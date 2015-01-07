package troevil.dao;

import troevil.model.Artstatus;

public interface ArtstatusMapper {
	int deleteByPrimaryKey(Integer articlestatus);

	int insert(Artstatus record);

	int insertSelective(Artstatus record);

	Artstatus selectByPrimaryKey(Integer articlestatus);

	int updateByPrimaryKeySelective(Artstatus record);

	int updateByPrimaryKey(Artstatus record);
}