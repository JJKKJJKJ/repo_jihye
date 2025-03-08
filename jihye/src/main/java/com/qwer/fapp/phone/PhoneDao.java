package com.qwer.fapp.phone;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qwer.fapp.address.AddressDto;

@Repository
public interface PhoneDao {

	public List<PhoneDto>selectList();
	public PhoneDto selectOne(PhoneDto phoneDto);
	public int insert(PhoneDto phoneDto);
	public int update(PhoneDto phoneDto);
	public int delete(PhoneDto phoneDto);
	public int uelete(PhoneDto phoneDto);
}
