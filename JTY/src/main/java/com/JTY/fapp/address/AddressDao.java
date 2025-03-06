package com.JTY.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {
	
	public List<AddressDto> selectList();
	public AddressDto selectItem(AddressDto addressDto);
	public int insert(AddressDto addressDto);
	public int update(AddressDto addressDto);
}
