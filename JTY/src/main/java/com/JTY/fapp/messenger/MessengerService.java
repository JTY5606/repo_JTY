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
	public MessengerDto selectItem(MessengerDto messengerDto) {
		return messengerDao.selectItem(messengerDto);
	}
	public int insert(MessengerDto messengerDto) {
		return messengerDao.insert(messengerDto);
	}
	public int update(MessengerDto messengerDto) {
		return messengerDao.update(messengerDto);
	}
}
