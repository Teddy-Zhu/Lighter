package troevil.interfaces;

import java.util.List;

import troevil.model.Publicinfo;

public interface PublicinfoI {

	public List<Publicinfo> getAllpublicinfo(Integer start, Integer size);

	public Integer getnumber();

	public Integer insertnewselective(Publicinfo record);
}
