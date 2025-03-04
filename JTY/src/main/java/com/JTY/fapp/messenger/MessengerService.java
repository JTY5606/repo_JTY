package com.JTY.fapp.messenger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessengerService {
	
	@Autowired
	MessengerDao messengerDao;
	
	public List<MessengerDto> selectList() {
		List<MessengerDto> messengerDtos = new ArrayList<>();
		
		messengerDtos = messengerDao.selectList();
		
		return messengerDtos; 
	}

}
