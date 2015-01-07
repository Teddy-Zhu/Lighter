package troevil.dao;

import troevil.model.Commit;

public interface CommitMapper {
	int deleteByPrimaryKey(Integer commitid);

	int insert(Commit record);

	int insertSelective(Commit record);

	Commit selectByPrimaryKey(Integer commitid);

	int updateByPrimaryKeySelective(Commit record);

	int updateByPrimaryKey(Commit record);
}