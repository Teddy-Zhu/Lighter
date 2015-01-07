package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.MembersMapper;
import troevil.interfaces.MembersI;
import troevil.model.Members;

@Service("memberService")
public class MemberImpl implements MembersI {

	private MembersMapper memMapper;

	public MembersMapper getMemMapper() {
		return memMapper;
	}

	@Autowired
	public void setMemMapper(MembersMapper memMapper) {
		this.memMapper = memMapper;
	}

	@Override
	public Members getmembyuserid(Integer userid) {
		return memMapper.selectByPrimaryKey(userid);
	}

	@Override
	public Members verifySelective(String type, String username, String password) {
		return memMapper.verifySelective(type, username, password);
	}

	@Override
	public int updateMember(Members record) {
		return memMapper.updateByPrimaryKey(record);
	}

	@Override
	public int registernewmember(Members record) {
		return memMapper.insertSelective(record);
	}

	@Override
	public Members selectRepeat(String type, String condition) {
		return memMapper.selectRepeat(type, condition);
	}

	@Override
	public List<Members> selectarticlemem(String statusname, Integer start,
			Integer end) {
		return memMapper.selectarticlemem(statusname, start, end);
	}

	@Override
	public Members selectByuserid(Integer userid) {
		return memMapper.selectByuserid(userid);
	}

}
