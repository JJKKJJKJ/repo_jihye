package com.qwer.fapp.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.club.ClubDto;

@Controller
public class SnsController {
	@Autowired
	 SnsService  snsService;
	
	@RequestMapping(value = "/sns/snsXdmList")
	public String snsXdmList(Model model) {
		model.addAttribute("list",snsService.selectList());	
		return "sns/snsXdmList";
	}
	@RequestMapping(value = "/sns/snsXdmView")
	public String snsXdmView(Model model , SnsDto snsDto) {
		
		System.out.println("snsDto.getSeq():" + snsDto.getSeq());
		
		model.addAttribute("item",snsService.selectOne(snsDto));	
		return "sns/snsXdmView";
	}
	@RequestMapping(value = "/sns/snsXdmForm")
	public String snsXdmForm() {
		return "sns/snsXdmForm";
	}
	
	@RequestMapping(value = "/sns/snsXdmInst")
	public String snsXdmInst(SnsDto snsDto) {
		System.out.println("snsDto.getSeq():" + snsDto.getSeq());
		System.out.println("snsDto.getDirectInput():" + snsDto.getMassenger());
		
		snsService.insert(snsDto);
		
		return "redirect:/sns/snsXdmList";
	}
	
}

