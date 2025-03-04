package com.qwer.fapp.conpany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConpanyController {
	@Autowired
	 ConpanyService  conpanyService;
	
	@RequestMapping(value = "/conpany/conpanyXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list",conpanyService.selectList());
		return "conpany/conpanyXdmList";
	}
	
	@RequestMapping(value = "/conpany/conpanyXdmView")
	public String codeGroupXdmView(Model model ,  ConpanyDto  conpanyDto) {
		
		System.out.println("conpanyDtoDto.getSeq():" + conpanyDto.getSeq());
		
		model.addAttribute("item",conpanyService.selectOne(conpanyDto));
		return "conpany/conpanyXdmView";
	}
	
}
