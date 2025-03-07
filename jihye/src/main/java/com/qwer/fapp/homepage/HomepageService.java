package com.qwer.fapp.homepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwer.fapp.sns.SnsDto;

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
	public int insert(HomepageDto homepageDto){
		return homepageDao.insert(homepageDto);
	}
	public int update(HomepageDto homepageDto){
		return homepageDao.update(homepageDto);
	}
	public int delete(HomepageDto homepageDto){
		return homepageDao.delete(homepageDto);
	}

}
