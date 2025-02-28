package com.qwer.fapp.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneController {
	@Autowired
	 PhoneService  phoneService;
	
	@RequestMapping(value = "/phone/phoneXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list",phoneService.selectList());
		
		return "phone/phoneXdmList";
	}
	
}
