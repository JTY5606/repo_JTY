package com.JTY.fapp.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	public List<MemberDto> selectList();
	public MemberDto selectOne(MemberDto memberDto);//맵퍼까지 끌고가서 값을 넣어줌
	public MemberDto selectTwo(MemberDto memberDto);
	public MemberDto selectB(MemberDto memberDto);
	public MemberDto selectC(MemberDto memberDto);
	public MemberDto selectAll(MemberDto memberDto);
	public int insert(MemberDto memberDto);

}
