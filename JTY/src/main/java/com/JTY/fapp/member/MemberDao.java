package com.JTY.fapp.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	public List<MemberDto> selectList();
	public MemberDto selectOne();

}
