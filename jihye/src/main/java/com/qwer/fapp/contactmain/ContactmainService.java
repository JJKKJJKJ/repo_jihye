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
	public ContactmainDto selectOne(ContactmainDto contactmainDto){
		return  contactmainDao.selectOne(contactmainDto);
	}
	public int insert(ContactmainDto contactmainDto){
		return  contactmainDao.insert(contactmainDto);
	}
	public int update(ContactmainDto contactmainDto){
		return  contactmainDao.update(contactmainDto);
	}
	public int delete(ContactmainDto contactmainDto){
		return  contactmainDao.delete(contactmainDto);
	}
}
