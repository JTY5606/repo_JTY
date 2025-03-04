package com.JTY.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	
	@Autowired
	CompanyDao companyDao;
	
	public List<CompanyDto> selectList() {
		List<CompanyDto> companyDtos = new ArrayList<>();
		
		companyDtos = companyDao.selectList();
		
		return companyDtos; 
	}

}
