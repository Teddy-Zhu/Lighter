package troevil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.MemlimitMapper;
import troevil.interfaces.MemlimitI;
import troevil.model.Memlimit;

@Service("memlimitService")
public class MemlimitImpl implements MemlimitI {

	private MemlimitMapper memlimitMapper;

	public MemlimitMapper getMemlimitMapper() {
		return memlimitMapper;
	}

	@Autowired
	public void setMemlimitMapper(MemlimitMapper memlimitMapper) {
		this.memlimitMapper = memlimitMapper;
	}

	@Override
	public Memlimit getMemlimit(Integer limitid) {
		return memlimitMapper.selectByPrimaryKey(limitid);
	}

	@Override
	public Integer updateselect(Memlimit record) {
		return memlimitMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Integer insertlimitid(Memlimit record) {
		return memlimitMapper.insertlimitid(record);
	}

}
