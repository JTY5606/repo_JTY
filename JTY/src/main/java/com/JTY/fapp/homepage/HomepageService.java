package com.JTY.fapp.homepage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
	
	@Autowired
	HomepageDao homepageDao;
	
	public List<HomepageDto> selectList() {
		List<HomepageDto> homepageDtos = new ArrayList<>();
		
		homepageDtos = homepageDao.selectList();
		
		return homepageDtos; 
	}
	public HomepageDto selectItem(HomepageDto homepageDto) {
		return homepageDao.selectItem(homepageDto);
	}
	public int insert(HomepageDto homepageDto) {
		return homepageDao.insert(homepageDto);
	}
	public int update(HomepageDto homepageDto) {
		return homepageDao.update(homepageDto);
	}
}
