package com.JTY.fapp.homepage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface HomepageDao {
	
	public List<HomepageDto> selectList();
	public HomepageDto selectItem(HomepageDto homepageDto);
	public int insert(HomepageDto homepageDto);
	public int update(HomepageDto homepageDto);

}
