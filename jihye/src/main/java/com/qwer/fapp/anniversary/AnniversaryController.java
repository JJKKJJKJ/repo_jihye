package com.qwer.fapp.anniversary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.sns.SnsDto;

@Controller
public class AnniversaryController {
	@Autowired
	AnniversaryService anniversaryService; 
	

	@RequestMapping(value = "/anniversary/anniversaryXdmList")
	public String anniversaryXdmList(Model model) {
		model.addAttribute("list",anniversaryService.selectList());
		return "anniversary/anniversaryXdmList";
	}
	
	@RequestMapping(value = "/anniversary/anniversaryXdmView")
	public String anniversaryXdmView(Model model ,AnniversaryDto anniversaryDto) {
		
		System.out.println("anniversaryDto.getSeq():" + anniversaryDto.getSeq());
		
		model.addAttribute("item",anniversaryService.selectOne(anniversaryDto));
		return "anniversary/anniversaryXdmView";
	}
	@RequestMapping(value = "/anniversary/anniversaryXdmForm")
	public String anniversaryXdmForm() {
		return "anniversary/anniversaryXdmForm";
	}
	
	@RequestMapping(value = "/anniversary/anniversaryXdmInst")
	public String anniversaryXdmInst(AnniversaryDto anniversaryDto) {
		System.out.println("anniversaryDto.getSeq():" + anniversaryDto.getSeq());
		System.out.println("anniversaryDto.getDirectInput():" + anniversaryDto.getDate());
		
		anniversaryService.insert(anniversaryDto);
		
		return "redirect:/anniversary/anniversaryXdmList";
	}

}
