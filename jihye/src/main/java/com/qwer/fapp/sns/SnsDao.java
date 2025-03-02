package com.qwer.fapp.sns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SnsDao {

	public List<SnsDto>selectList();
}
