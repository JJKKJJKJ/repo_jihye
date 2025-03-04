package com.qwer.fapp.anniversary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnniversaryService {
	@Autowired
	AnniversaryDao anniversaryDao; 
	
	public List< AnniversaryDto> selectList(){
		return   anniversaryDao.selectList();
	}
	public AnniversaryDto selectOne(AnniversaryDto anniversaryDto){
		return   anniversaryDao.selectOne(anniversaryDto);
	}
}
