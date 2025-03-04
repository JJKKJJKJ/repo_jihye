package com.qwer.fapp.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
	@Autowired
	PhoneDao phoneDao;
	
	public List<PhoneDto> selectList(){
		return phoneDao.selectList();
	}
	public PhoneDto selectOne(PhoneDto phoneDto){
		return phoneDao.selectOne(phoneDto);
	}

}


