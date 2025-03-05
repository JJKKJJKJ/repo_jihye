package com.qwer.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.club.ClubDto;

@Controller
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value = "/address/addressXdmList")
	public String addressXdmList(Model model) {
		model.addAttribute("list",addressService.selectList());
		return "address/addressXdmList";
	}
	@RequestMapping(value = "/address/addressXdmView")
	public String addressXdmView(Model model, AddressDto  addressDto) {
		
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		
		model.addAttribute("item",addressService.selectOne(addressDto));
		return "address/addressXdmView";
	}
	@RequestMapping(value = "/address/addressXdmForm")
	public String addressXdmForm() {
		
		return "address/addressXdmForm";
	}
	
	@RequestMapping(value = "/address/addressXdmInst")
	public String addressXdmInst(AddressDto  addressDto) {
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		System.out.println("addressDto.getaddressInput():" + addressDto.getAddress());
		
		addressService.insert(addressDto);
		
		return "redirect:/address/addressXdmList";
	}

}
