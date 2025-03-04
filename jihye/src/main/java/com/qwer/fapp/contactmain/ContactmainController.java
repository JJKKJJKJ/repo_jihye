package com.qwer.fapp.contactmain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactmainController {
	
	@Autowired
	ContactmainService contactmainService;
	
	@RequestMapping(value = "/contactmain/contactmainXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list",contactmainService.selectList());
		return "contactmain/contactmainXdmList";
	}
	
	@RequestMapping(value = "/contactmain/contactmainXdmView")
	public String codeGroupXdmView(Model model,ContactmainDto contactmainDto) {
		
		System.out.println("contactmainDto.getSeq():" + contactmainDto.getSeq());
		
		model.addAttribute("item",contactmainService.selectOne(contactmainDto));
		return "contactmain/contactmainXdmView";
	}
}
