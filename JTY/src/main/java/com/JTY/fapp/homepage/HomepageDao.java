package com.JTY.fapp.homepage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface HomepageDao {
	
	public List<HomepageDto> selectList();

}
