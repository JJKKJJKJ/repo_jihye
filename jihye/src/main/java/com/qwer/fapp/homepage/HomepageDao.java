package com.qwer.fapp.homepage;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface HomepageDao {
	public List<HomepageDto>selectList();
	public HomepageDto selectOne(HomepageDto homepageDto);
	public int insert(HomepageDto homepageDto);
	public int update(HomepageDto homepageDto);
	public int delete(HomepageDto homepageDto);
	public int uelete(HomepageDto homepageDto);
}
