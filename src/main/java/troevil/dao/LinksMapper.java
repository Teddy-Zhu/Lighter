package troevil.dao;

import java.util.List;

import troevil.model.Links;

public interface LinksMapper {
	int deleteByPrimaryKey(Integer linkid);

	int insert(Links record);

	int insertSelective(Links record);

	Links selectByPrimaryKey(Integer linkid);

	int updateByPrimaryKeySelective(Links record);

	int updateByPrimaryKey(Links record);

	List<Links> getAlllinks(Integer enable);

	int getnumber(Integer enable);
}