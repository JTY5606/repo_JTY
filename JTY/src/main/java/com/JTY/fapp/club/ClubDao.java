package com.JTY.fapp.club;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClubDao {
	
	public List<ClubDto> selectList();

}
