package com.qwer.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	AddressDao addressDao;
	
	public List<AddressDto> selectList(){
		return addressDao.selectList();
	}

}	
