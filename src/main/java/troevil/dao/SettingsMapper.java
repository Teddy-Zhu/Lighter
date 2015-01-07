package troevil.dao;

import troevil.model.Settings;

public interface SettingsMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Settings record);

	int insertSelective(Settings record);

	Settings selectByPrimaryKey(Integer id);

	Settings selectByname(String name);

	int updateByPrimaryKeySelective(Settings record);

	int updateByPrimaryKey(Settings record);
}