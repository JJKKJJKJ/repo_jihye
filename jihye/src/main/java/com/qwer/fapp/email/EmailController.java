package com.qwer.fapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/email/emailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list",emailService.selectList());
		return "email/emailXdmList";
	}

}
