package com.JTY.fapp.phoneNumber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JTY.fapp.member.MemberDto;

@Service
public class PhoneNumberService {
	
	@Autowired
	PhoneNumberDao phoneNumberDao;
	
	public List<PhoneNumberDto> selectList() {
		
		return phoneNumberDao.selectList();
	}
	public PhoneNumberDto selectItem(PhoneNumberDto phoneNumberDto) {
		return phoneNumberDao.selectItem(phoneNumberDto);
	}
	public int insert(PhoneNumberDto phoneNumberDto) {
		return phoneNumberDao.insert(phoneNumberDto);
	}
}
