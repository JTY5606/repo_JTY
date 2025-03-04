package com.JTY.fapp.club;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {
	
	@Autowired
	ClubDao clubDao;
	
	public List<ClubDto> selectList() {
		List<ClubDto> clubDtos = new ArrayList<>();
		
		clubDtos = clubDao.selectList();
		
		return clubDtos; 
	}

}
