package troevil.dao;

import java.util.List;

import troevil.model.Memtype;

public interface MemtypeMapper {
	int deleteByPrimaryKey(Integer typeid);

	int insert(Memtype record);

	int insertSelective(Memtype record);

	Memtype selectByPrimaryKey(Integer typeid);

	List<Memtype> selectAllowregtype(Integer allowreg);

	int updateByPrimaryKeySelective(Memtype record);

	int updateByPrimaryKey(Memtype record);
}