package com.JTY.fapp.phoneNumber;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService {
	
	@Autowired
	PhoneNumberDao phoneNumberDao;
	
	public List<PhoneNumberDto> selectList() {
		List<PhoneNumberDto> phoneNumberDtos = new ArrayList<>();
		
		phoneNumberDtos = phoneNumberDao.selectList();
		
		return phoneNumberDtos; 
	}

}
