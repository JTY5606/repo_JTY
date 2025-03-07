package com.JTY.fapp.club1;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Club1Dao {
	
	public List<Club1Dto> selectList();
	public Club1Dto selectItem(Club1Dto club1Dto);
	public int insert(Club1Dto club1Dto);
	public int update(Club1Dto club1Dto);
	public int delete(Club1Dto club1Dto);
	public int uelete(Club1Dto club1Dto);

}
