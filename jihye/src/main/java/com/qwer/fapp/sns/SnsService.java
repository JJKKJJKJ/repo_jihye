package com.qwer.fapp.sns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsService {
	@Autowired
	SnsDao snsDao;
	
	public List<SnsDto> selectList(){
		return snsDao.selectList();
	}
	public SnsDto selectOne(SnsDto snsDto){
		return snsDao.selectOne(snsDto);
	}

}


