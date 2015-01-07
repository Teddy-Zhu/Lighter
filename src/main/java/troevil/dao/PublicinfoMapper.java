package troevil.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import troevil.model.Publicinfo;

public interface PublicinfoMapper {
	int deleteByPrimaryKey(Integer publicid);

	int insert(Publicinfo record);

	int insertSelective(Publicinfo record);

	Publicinfo selectByPrimaryKey(Integer publicid);

	List<Publicinfo> getAllpublic(@Param("start") Integer start,
			@Param("size") Integer size);

	int updateByPrimaryKeySelective(Publicinfo record);

	int updateByPrimaryKey(Publicinfo record);

	int getnumber();
}