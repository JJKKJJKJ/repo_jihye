package com.qwer.fapp.phone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDao {

	public List<PhoneDto>selectList();
}
