package com.qwer.fapp.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.address.AddressDto;
import com.qwer.fapp.sns.SnsDto;

@Controller
public class PhoneController {
	@Autowired
	 PhoneService  phoneService;
	
	@RequestMapping(value = "/phone/phoneXdmList")
	public String phoneXdmList(Model model) {
		model.addAttribute("list",phoneService.selectList());	
		return "phone/phoneXdmList";
	}
	
	@RequestMapping(value = "/phone/phoneXdmView")
	public String phoneXdmView(Model model , PhoneDto phoneDto) {
		
		System.out.println("phoneDto.getSeq():" + phoneDto.getSeq());
		
		model.addAttribute("item",phoneService.selectOne(phoneDto));	
		return "phone/phoneXdmView";
	}
	@RequestMapping(value = "/phone/phoneXdmForm")
	public String phoneXdmForm() {
		return "phone/phoneXdmForm";
	}
	
	@RequestMapping(value = "/phone/phoneXdmInst")
	public String phoneXdmInst(PhoneDto phoneDto) {
		System.out.println("phoneDto.getSeq():" + phoneDto.getSeq());
		System.out.println("phoneDto.getDirectInput():" + phoneDto.getNumber());
		
		phoneService.insert(phoneDto);
		
		return "redirect:/phone/phoneXdmList";
	}
	

}
