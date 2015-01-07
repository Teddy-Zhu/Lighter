package troevil.dao;

import troevil.model.Logs;

public interface LogsMapper {
	int deleteByPrimaryKey(Integer logid);

	int insert(Logs record);

	int insertSelective(Logs record);

	Logs selectByPrimaryKey(Integer logid);

	int updateByPrimaryKeySelective(Logs record);

	int updateByPrimaryKey(Logs record);
}