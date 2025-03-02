package com.qwer.fapp.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	EmailDao emailDao;
	
	public List<EmailDto> selectList(){
		return emailDao.selectList();
	}
}
