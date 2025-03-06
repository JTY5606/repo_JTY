package com.JTY.fapp.email;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	EmailDao emailDao;
	
	public List<EmailDto> selectList() {
		List<EmailDto> emailDtos = new ArrayList<>();
		
		emailDtos = emailDao.selectList();
		
		return emailDtos; 
	}
	
	public EmailDto selectEmail(EmailDto emailDto) {
		
		return emailDao.selectEmail(emailDto);
	}
	public int insert(EmailDto emailDto) {
		
		return emailDao.insert(emailDto);
	}
	public int update(EmailDto emailDto) {
		
		return emailDao.update(emailDto);
	}
}
