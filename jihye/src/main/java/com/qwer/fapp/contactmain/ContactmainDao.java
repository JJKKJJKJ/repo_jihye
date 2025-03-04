package com.qwer.fapp.contactmain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactmainDao {
	
 public List<ContactmainDto> selectList(); 
 public ContactmainDto selectOne(ContactmainDto contactmainDto); 
}
