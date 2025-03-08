package com.qwer.fapp.conpany;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qwer.fapp.sns.SnsDto;

@Repository
public interface ConpanyDao {

	public List<ConpanyDto>selectList();
	public ConpanyDto selectOne(ConpanyDto conpanyDto);
	public int insert(ConpanyDto conpanyDto);
	public int update(ConpanyDto conpanyDto);
	public int delete(ConpanyDto conpanyDto);
	public int uelete(ConpanyDto conpanyDto);
}
