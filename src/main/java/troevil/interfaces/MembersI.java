package troevil.interfaces;

import java.util.List;

import troevil.model.Members;

public interface MembersI {

	public Members getmembyuserid(Integer userid);

	public Members verifySelective(String type, String username, String password);

	public int updateMember(Members record);

	public int registernewmember(Members record);

	public Members selectRepeat(String type, String condition);

	public Members selectByuserid(Integer userid);

	public List<Members> selectarticlemem(String statusname, Integer start,
			Integer end);
}
