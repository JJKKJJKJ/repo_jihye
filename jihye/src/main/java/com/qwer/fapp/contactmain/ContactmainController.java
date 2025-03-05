package com.qwer.fapp.contactmain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.sns.SnsDto;

@Controller
public class ContactmainController {
	
	@Autowired
	ContactmainService contactmainService;
	
	@RequestMapping(value = "/contactmain/contactmainXdmList")
	public String contactmainXdmList(Model model) {
		model.addAttribute("list",contactmainService.selectList());
		return "contactmain/contactmainXdmList";
	}
	
	@RequestMapping(value = "/contactmain/contactmainXdmView")
	public String contactmainXdmView(Model model,ContactmainDto contactmainDto) {
		
		System.out.println("contactmainDto.getSeq():" + contactmainDto.getSeq());
		
		model.addAttribute("item",contactmainService.selectOne(contactmainDto));
		return "contactmain/contactmainXdmView";
	}
	
	@RequestMapping(value = "/contactmain/contactmainXdmForm")
	public String contactmainXdmForm() {
		return "contactmain/contactmainXdmForm";
	}
	
	@RequestMapping(value = "/contactmain/contactmainXdmInst")
	public String snsXdmInst(ContactmainDto contactmainDto) {
		System.out.println("contactmainDto.getSeq():" + contactmainDto.getSeq());
		System.out.println("contactmainDto.getDirectInput():" + contactmainDto.getFirstName());
		System.out.println("contactmainDto.getDirectInput():" + contactmainDto.getLastName());
		
		contactmainService.insert(contactmainDto);
		
		return "redirect:/contactmain/contactmainXdmList";
	}
}
