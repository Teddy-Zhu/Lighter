package troevil.dao;

import troevil.model.Memstatus;

public interface MemstatusMapper {
	int deleteByPrimaryKey(Integer statusid);

	int insert(Memstatus record);

	int insertSelective(Memstatus record);

	Memstatus selectByPrimaryKey(Integer statusid);

	int updateByPrimaryKeySelective(Memstatus record);

	int updateByPrimaryKey(Memstatus record);
}