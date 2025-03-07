package com.qwer.fapp.conpany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.sns.SnsDto;

@Controller
public class ConpanyController {
	@Autowired
	 ConpanyService  conpanyService;
	
	@RequestMapping(value = "/conpany/conpanyXdmList")
	public String conpanyXdmList(Model model) {
		model.addAttribute("list",conpanyService.selectList());
		return "conpany/conpanyXdmList";
	}
	
	@RequestMapping(value = "/conpany/conpanyXdmView")
	public String conpanyXdmView(Model model ,  ConpanyDto  conpanyDto) {
		
		System.out.println("conpanyDtoDto.getSeq():" + conpanyDto.getSeq());
		
		model.addAttribute("item",conpanyService.selectOne(conpanyDto));
		return "conpany/conpanyXdmView";
	}
	@RequestMapping(value = "/conpany/conpanyXdmForm")
	public String conpanyXdmForm() {
		return "conpany/conpanyXdmForm";
	}
	
	@RequestMapping(value = "/conpany/conpanyXdmInst")
	public String conpanyXdmInst(ConpanyDto conpanyDto) {
		System.out.println("conpanyDto.getSeq():" + conpanyDto.getSeq());
		System.out.println("conpanyDto.getDirectInput():" + conpanyDto.getPosition());
		
		conpanyService.insert(conpanyDto);
		
		return "redirect:/conpany/conpanyXdmList";
	}
	@RequestMapping(value = "/conpany/conpanyXdmMfom")
	public String conpanyXdmMfom(Model model , ConpanyDto conpanyDto) {
		model.addAttribute("item",conpanyService.selectOne(conpanyDto));	
		return "conpany/conpanyXdmMfom";
	}
	@RequestMapping(value = "/conpany/conpanyXdmUpdt")
	public String conpanyXdmUpdt(ConpanyDto conpanyDto) {
		System.out.println("snsDto.getSeq():" + conpanyDto.getSeq());
		System.out.println("snsDto.getDirectInput():" + conpanyDto.getPosition());
		conpanyService.update(conpanyDto);
		return "redirect:/conpany/conpanyXdmList";
	}
	@RequestMapping(value = "/conpany/conpanyXdmDele")
	public String conpanyXdmDele(ConpanyDto conpanyDto) {
	
		conpanyService.delete(conpanyDto);
		return "redirect:/conpany/conpanyXdmList";
	}
	
}
