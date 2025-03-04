package com.qwer.fapp.conpany;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ConpanyDao {

	public List<ConpanyDto>selectList();
	public ConpanyDto selectOne(ConpanyDto conpanyDto);
}
