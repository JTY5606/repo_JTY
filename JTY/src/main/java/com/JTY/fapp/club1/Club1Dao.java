package com.JTY.fapp.club1;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Club1Dao {
	
	public List<Club1Dto> selectList();

}
