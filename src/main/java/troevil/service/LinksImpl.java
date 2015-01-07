package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.LinksMapper;
import troevil.interfaces.LinksI;
import troevil.model.Links;

@Service("linksService")
public class LinksImpl implements LinksI {

	private LinksMapper linksMapper;

	public LinksMapper getLinksMapper() {
		return linksMapper;
	}

	@Autowired
	public void setLinksMapper(LinksMapper linksMapper) {
		this.linksMapper = linksMapper;
	}

	@Override
	public List<Links> getAlllinks(Integer enable) {
		return linksMapper.getAlllinks(enable);
	}

	@Override
	public int getnumber(Integer enable) {
		return linksMapper.getnumber(enable);
	}

	@Override
	public int insertSelective(Links record) {
		return linksMapper.insertSelective(record);
	}

}
