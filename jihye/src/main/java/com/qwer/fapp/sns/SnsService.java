package com.qwer.fapp.sns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsService {
	@Autowired
	SnsDao snsDao;
	
	public List<SnsDto> selectList(){
		return snsDao.selectList();
	}
	public SnsDto selectOne(SnsDto snsDto){
		return snsDao.selectOne(snsDto);
	}
	public int insert(SnsDto snsDto){
		return snsDao.insert(snsDto);
	}
	public int update(SnsDto snsDto){
		return snsDao.update(snsDto);
	}
	public int delete(SnsDto snsDto){
		return snsDao.delete(snsDto);
	}

}


