package troevil.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import troevil.model.Members;

public interface MembersMapper {
	int deleteByPrimaryKey(Integer userid);

	int insert(Members record);

	int insertSelective(Members record);

	Members selectByPrimaryKey(Integer userid);

	Members verifySelective(@Param("type") String type,
			@Param("username") String username,
			@Param("password") String password);

	Members selectRepeat(@Param("type") String type,
			@Param("condition") String condition);

	List<Members> selectarticlemem(@Param("statusname") String statusname,
			@Param("start") Integer start, @Param("end") Integer end);

	Members selectByuserid(Integer userid);

	int updateByPrimaryKeySelective(Members record);

	int updateByPrimaryKey(Members record);
}