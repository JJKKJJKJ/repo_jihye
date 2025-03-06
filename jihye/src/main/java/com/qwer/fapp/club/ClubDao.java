package com.qwer.fapp.club;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClubDao {
	
//	mapper 에서 해당하는 쿼리와 연결 시켜 주고
//	쿼리 결과를 가져옴
	public List<ClubDto> selectList(); 
	public ClubDto selectOne(ClubDto clubDto); 
	public int insert(ClubDto clubDto); 
	public int update(ClubDto clubDto); 
}
