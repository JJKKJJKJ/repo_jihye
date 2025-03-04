package com.qwer.fapp.homepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
	@Autowired
	HomepageDao homepageDao;
	
	public List<HomepageDto> selectList(){
		return homepageDao.selectList();
	}
	public HomepageDto selectOne(HomepageDto homepageDto){
		return homepageDao.selectOne(homepageDto);
	}
}
