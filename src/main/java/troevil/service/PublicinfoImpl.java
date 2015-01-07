package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.PublicinfoMapper;
import troevil.interfaces.PublicinfoI;
import troevil.model.Publicinfo;

@Service("publicinfoService")
public class PublicinfoImpl implements PublicinfoI {

	private PublicinfoMapper publicinfoMapper;

	public PublicinfoMapper getPublicinfoMapper() {
		return publicinfoMapper;
	}

	@Autowired
	public void setPublicinfoMapper(PublicinfoMapper publicinfoMapper) {
		this.publicinfoMapper = publicinfoMapper;
	}

	@Override
	public List<Publicinfo> getAllpublicinfo(Integer start, Integer size) {
		return publicinfoMapper.getAllpublic(start, size);
	}

	@Override
	public Integer getnumber() {
		return publicinfoMapper.getnumber();
	}

	@Override
	public Integer insertnewselective(Publicinfo record) {
		return publicinfoMapper.insertSelective(record);
	}

}
