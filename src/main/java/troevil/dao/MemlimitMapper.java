package troevil.dao;

import troevil.model.Memlimit;

public interface MemlimitMapper {
	int deleteByPrimaryKey(Integer limitid);

	int insert(Memlimit record);

	int insertSelective(Memlimit record);

	Memlimit selectByPrimaryKey(Integer limitid);

	int updateByPrimaryKeySelective(Memlimit record);

	int updateByPrimaryKey(Memlimit record);

	int insertlimitid(Memlimit record);
}