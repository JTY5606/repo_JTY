package com.JTY.fapp.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;
	
	public List<MemberDto> selectList() {
			
		return memberDao.selectList();
	}
	
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	public MemberDto selectTwo(MemberDto memberDto) {
		return memberDao.selectTwo(memberDto);
	}
	public MemberDto selectB(MemberDto memberDto) {
		return memberDao.selectB(memberDto);
	}
	public MemberDto selectC(MemberDto memberDto) {
		return memberDao.selectC(memberDto);
	}
}
