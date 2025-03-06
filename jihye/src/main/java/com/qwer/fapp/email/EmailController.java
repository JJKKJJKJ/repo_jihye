package com.qwer.fapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.sns.SnsDto;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/email/emailXdmList")
	public String emailXdmList(Model model) {
		model.addAttribute("list",emailService.selectList());
		return "email/emailXdmList";
	}
	@RequestMapping(value = "/email/emailXdmView")
	public String emailXdmView(Model model ,EmailDto emailDto) {
		
		System.out.println("emailDto.getSeq():" + emailDto.getSeq());
		
		model.addAttribute("item",emailService.selectOne(emailDto));
		return "email/emailXdmView";
	}
	
	@RequestMapping(value = "/email/emailXdmForm")
	public String emailXdmForm() {
		return "email/emailXdmForm";
	}
	
	@RequestMapping(value = "/email/emailXdmInst")
	public String emailXdmInst(EmailDto emailDto) {
		System.out.println("emailDto.getSeq():" + emailDto.getSeq());
		System.out.println("emailDto.getDirectInput():" + emailDto.getEmail());
		
		emailService.insert(emailDto);
		
		return "redirect:/email/emailXdmList";
	}
	@RequestMapping(value = "/email/emailXdmMfom")
	public String emailXdmMfom(Model model , EmailDto emailDto) {
		model.addAttribute("item",emailService.selectOne(emailDto));	
		return "email/emailXdmMfom";
	}
	@RequestMapping(value = "/email/emailXdmUpdt")
	public String emailXdmUpdt(EmailDto emailDto) {
		System.out.println("emailDto.getSeq():" + emailDto.getSeq());
		System.out.println("emailDto.getDirectInput():" + emailDto.getEmail());
		emailService.update(emailDto);
		return "redirect:/email/emailXdmList";
	}

}
