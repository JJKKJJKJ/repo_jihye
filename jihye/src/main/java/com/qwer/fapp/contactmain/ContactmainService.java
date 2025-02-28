package com.qwer.fapp.contactmain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactmainService {
	@Autowired
	ContactmainDao contactmainDao;
	public List<ContactmainDto> selectList(){
		return  contactmainDao.selectList();
	}
}
