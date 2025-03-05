package com.JTY.fapp.company;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {
	
	public List<CompanyDto> selectList();
	public CompanyDto selectItem(CompanyDto companyDto);
	public int insert(CompanyDto companyDto);
}
