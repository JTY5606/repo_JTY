package com.JTY.fapp.birthday;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BirthdayDao {
	
	public List<BirthdayDto> selectList();

}
