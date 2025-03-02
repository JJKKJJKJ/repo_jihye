package com.qwer.fapp.anniversary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnniversaryController {
	@Autowired
	AnniversaryService anniversaryService; 
	

	@RequestMapping(value = "/anniversary/anniversaryXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list",anniversaryService.selectList());
		
		return "anniversary/anniversaryXdmList";
	}

}
