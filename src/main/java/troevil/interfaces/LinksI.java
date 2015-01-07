package troevil.interfaces;

import java.util.List;

import troevil.model.Links;

public interface LinksI {

	public List<Links> getAlllinks(Integer enable);

	public int getnumber(Integer enable);

	public int insertSelective(Links record);
}
