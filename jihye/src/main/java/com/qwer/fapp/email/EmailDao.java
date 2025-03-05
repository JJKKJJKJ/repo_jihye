package com.qwer.fapp.email;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qwer.fapp.sns.SnsDto;


@Repository
public interface EmailDao {
	public List<EmailDto>selectList();
	public EmailDto selectOne(EmailDto emailDto);
	public int insert(EmailDto emailDto);
}
