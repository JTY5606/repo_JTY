package com.JTY.fapp.birthday;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BirthdayService {
	
	@Autowired
	BirthdayDao birthdayDao;
	
	public List<BirthdayDto> selectList() {
		List<BirthdayDto> birthdayDtos = new ArrayList<>();
		
		birthdayDtos = birthdayDao.selectList();
		
		return birthdayDtos; 
	}
	
	public BirthdayDto selectDate(BirthdayDto birthdayDto) {
		return birthdayDao.selectDate(birthdayDto);
	}
	public int insert(BirthdayDto birthdayDto) {
		return birthdayDao.insert(birthdayDto);
	}

}
