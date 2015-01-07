package troevil.dao;

import troevil.model.Visitors;
import troevil.model.VisitorsKey;

public interface VisitorsMapper {
	int deleteByPrimaryKey(VisitorsKey key);

	int insert(Visitors record);

	int insertSelective(Visitors record);

	Visitors selectByPrimaryKey(VisitorsKey key);

	int updateByPrimaryKeySelective(Visitors record);

	int updateByPrimaryKey(Visitors record);
}