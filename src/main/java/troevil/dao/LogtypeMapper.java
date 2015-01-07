package troevil.dao;

import troevil.model.Logtype;

public interface LogtypeMapper {
	int deleteByPrimaryKey(Integer logtype);

	int insert(Logtype record);

	int insertSelective(Logtype record);

	Logtype selectByPrimaryKey(Integer logtype);

	int updateByPrimaryKeySelective(Logtype record);

	int updateByPrimaryKey(Logtype record);
}