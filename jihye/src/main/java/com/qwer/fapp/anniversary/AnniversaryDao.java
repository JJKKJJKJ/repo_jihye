package com.qwer.fapp.anniversary;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AnniversaryDao {
	
	public List<AnniversaryDto> selectList(); 
	public AnniversaryDto selectOne(AnniversaryDto anniversaryDto); 

}
