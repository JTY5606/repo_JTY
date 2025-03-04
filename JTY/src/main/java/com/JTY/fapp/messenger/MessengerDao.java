package com.JTY.fapp.messenger;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MessengerDao {
	
	public List<MessengerDto> selectList();

}
