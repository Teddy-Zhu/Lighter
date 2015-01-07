package troevil.interfaces;

import troevil.model.Memlimit;

public interface MemlimitI {

	public Memlimit getMemlimit(Integer limitid);

	public Integer updateselect(Memlimit record);

	public Integer insertlimitid(Memlimit record);
}
