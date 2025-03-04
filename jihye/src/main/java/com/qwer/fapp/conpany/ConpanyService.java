package com.qwer.fapp.conpany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConpanyService {
	@Autowired
	ConpanyDao conpanyDao;
	
	public List<ConpanyDto> selectList(){
		return conpanyDao.selectList();
	}
	
	public ConpanyDto selectOne(ConpanyDto  conpanyDto){
		return conpanyDao.selectOne(conpanyDto);
	}

}


