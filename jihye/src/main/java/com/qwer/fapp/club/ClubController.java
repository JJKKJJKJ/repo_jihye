package com.qwer.fapp.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClubController {

	//입력되는 주소에 매칭이 되는 html 정보를 정의
	//hmtl로 데이터 전달
	
	@Autowired
	ClubService clubService; 
	
//	@RequestMapping(value = "/club/clubXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<ClubDto> clubDtos = new ArrayList<>();
//		
//		clubDtos = clubService.selectList();
//		model.addAttribute("list",clubDtos);
//		
//		System.out.println(clubDtos.get(4).getSeq());
//		
//		return "club/clubXdmList";
//	}
	@RequestMapping(value = "/club/clubXdmList")
	public String clubXdmList(Model model) {
		model.addAttribute("list",clubService.selectList());
		return "club/clubXdmList";
	}
		
	@RequestMapping(value = "/club/clubXdmView")
	public String clubXdmView(Model model , ClubDto clubDto) {
		
		System.out.println("clubDto.getSeq():" + clubDto.getSeq());
		
		model.addAttribute("item",clubService.selectOne(clubDto));
		return "club/clubXdmView";		
	}
	
	@RequestMapping(value = "/club/clubXdmForm")
	public String ClubXdmForm() {
		
		return "club/clubXdmForm";
	}
	
	@RequestMapping(value = "/club/clubXdmInst")
	public String ClubXdmInst(ClubDto clubDto) {
		System.out.println("clubDto.getSeq():" + clubDto.getSeq());
		System.out.println("clubDto.getDirectInput():" + clubDto.getDirectInput());
		
		clubService.insert(clubDto);
		
		return "redirect:/club/clubXdmList";
	}
	
	@RequestMapping(value = "/club/clubXdmMfom")
	public String ClubXdmMfom(Model model,ClubDto clubDto) {
		
		model.addAttribute("item",clubService.selectOne(clubDto));

//		System.out.println("ClubDto clubDto" + clubDto.getSeq());
		return "club/clubXdmMfom";
	}
	@RequestMapping(value = "/club/clubXdmUpdt")
	public String ClubXdmUpdt(ClubDto clubDto) {
		System.out.println("clubDto.getSeq():" + clubDto.getSeq());
		System.out.println("clubDto.getDirectInput():" + clubDto.getDirectInput());
		clubService.update(clubDto);
		return "redirect:/club/clubXdmList";
	}
}
