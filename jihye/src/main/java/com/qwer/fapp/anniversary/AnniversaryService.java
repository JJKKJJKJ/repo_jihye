package com.qwer.fapp.anniversary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwer.fapp.sns.SnsDto;
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
	public int insert(AnniversaryDto anniversaryDto){
		return anniversaryDao.insert(anniversaryDto);
	}
	public int update(AnniversaryDto anniversaryDto){
		return anniversaryDao.update(anniversaryDto);
	}
	public int delete(AnniversaryDto anniversaryDto){
		return anniversaryDao.delete(anniversaryDto);
	}
	public int uelete(AnniversaryDto anniversaryDto){
		return anniversaryDao.uelete(anniversaryDto);
	}

}
