package com.qwer.fapp.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.sns.SnsDto;

@Controller
public class HomepageController {
	
	@Autowired
	HomepageService homepageService;
	
	@RequestMapping(value = "/homepage/homepageXdmList")
	public String  homepageXdmList(Model model) {
		model.addAttribute("list",homepageService.selectList());
		return "homepage/homepageXdmList";
	}
	
	
	@RequestMapping(value = "/homepage/homepageXdmView")
	public String  homepageXdmView(Model model ,HomepageDto homepageDto ) {
		
		
		model.addAttribute("item",homepageService.selectOne(homepageDto));
		return "homepage/homepageXdmView";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmForm")
	public String homepageXdmForm() {
		return "homepage/homepageXdmForm";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmInst")
	public String homepageXdmInst(HomepageDto homepageDto) {
		System.out.println("homepageDto.getSeq():" + homepageDto.getSeq());
		System.out.println("homepageDto.getDirectInput():" + homepageDto.getHomeAddress());
		
		homepageService.insert(homepageDto);
		
		return "redirect:/homepage/homepageXdmList";
	}

}
