package com.JTY.fapp.phoneNumber;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberDao {
	
	public List<PhoneNumberDto> selectList();
	public PhoneNumberDto selectItem(PhoneNumberDto phoneNumberDto);
	public int insert(PhoneNumberDto phoneNumberDto);

}
