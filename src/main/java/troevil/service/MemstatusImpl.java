package troevil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.MemstatusMapper;
import troevil.interfaces.MemstatusI;
import troevil.model.Memstatus;

@Service("memstatusSerice")
public class MemstatusImpl implements MemstatusI {

	private MemstatusMapper memstatusMapper;

	public MemstatusMapper getMemstatusMapper() {
		return memstatusMapper;
	}

	@Autowired
	public void setMemstatusMapper(MemstatusMapper memstatusMapper) {
		this.memstatusMapper = memstatusMapper;
	}

	@Override
	public Memstatus getbystatusid(Integer statusid) {
		return memstatusMapper.selectByPrimaryKey(statusid);
	}

}
