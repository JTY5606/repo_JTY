package com.JTY.fapp.email;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EmailDao {
	
	public List<EmailDto> selectList();
	public EmailDto selectEmail(EmailDto emailDto);
	public int insert(EmailDto emailDto);
	public int update(EmailDto emailDto);

}
