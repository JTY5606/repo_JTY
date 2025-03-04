package com.JTY.fapp.club1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Club1Service {
	
	@Autowired
	Club1Dao club1Dao;
	
	public List<Club1Dto> selectList() {
		List<Club1Dto> club1Dtos = new ArrayList<>();
		
		club1Dtos = club1Dao.selectList();
		
		return club1Dtos; 
	}

}
