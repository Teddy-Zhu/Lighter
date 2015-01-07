package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.MemtypeMapper;
import troevil.interfaces.MemtypeI;
import troevil.model.Memtype;

@Service("memtypeService")
public class MemtypeImpl implements MemtypeI {

	private MemtypeMapper memtypeMapper;

	public MemtypeMapper getMemtypeMapper() {
		return memtypeMapper;
	}

	@Autowired
	public void setMemtypeMapper(MemtypeMapper memtypeMapper) {
		this.memtypeMapper = memtypeMapper;
	}

	@Override
	public List<Memtype> getmemberregtype(Integer allowreg) {
		return memtypeMapper.selectAllowregtype(allowreg);
	}

	@Override
	public Memtype getByPrimaryKey(Integer typeid) {
		return memtypeMapper.selectByPrimaryKey(typeid);
	}

	@Override
	public Integer updateselect(Memtype record) {
		return memtypeMapper.updateByPrimaryKeySelective(record);
	}
}
