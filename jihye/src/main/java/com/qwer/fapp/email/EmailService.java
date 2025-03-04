package com.qwer.fapp.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwer.fapp.phone.PhoneDto;

@Service
public class EmailService {
	@Autowired
	EmailDao emailDao;
	
	public List<EmailDto> selectList(){
		return emailDao.selectList();
	}
	public EmailDto selectOne(EmailDto emailDto){
		return emailDao.selectOne(emailDto);
	}
}
