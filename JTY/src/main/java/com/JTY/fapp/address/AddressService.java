package com.JTY.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public List<AddressDto> selectList() {
		List<AddressDto> addressDtos = new ArrayList<>();
		
		addressDtos = addressDao.selectList();
		
		return addressDtos; 
	}
	public AddressDto selectItem(AddressDto addressDto) {
		return addressDao.selectItem(addressDto);
	}
	public int insert(AddressDto addressDto) {
		return addressDao.insert(addressDto);
	}


}
