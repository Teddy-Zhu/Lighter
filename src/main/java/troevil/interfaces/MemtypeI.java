package troevil.interfaces;

import java.util.List;

import troevil.model.Memtype;

public interface MemtypeI {

	public List<Memtype> getmemberregtype(Integer allowreg);

	public Memtype getByPrimaryKey(Integer typeid);

	public Integer updateselect(Memtype record);
}
