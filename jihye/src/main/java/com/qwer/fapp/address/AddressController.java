package com.qwer.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.fapp.club.ClubDto;
import com.qwer.fapp.phone.PhoneDto;

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
	                   
	@RequestMapping(value = "/address/addressXdmMfom")
	public String addressXdmMfom(Model model,AddressDto  addressDto) {
		
		model.addAttribute("item",addressService.selectOne(addressDto));

		return "address/addressXdmMfom"; //hmtl 에서 바로가는 주소
	}
	@RequestMapping(value = "/address/addressXdmUpdt")
	public String addressXdmUpdt(AddressDto addressDto) {
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		System.out.println("addressDto.getAddress():" + addressDto.getAddress());
		addressService.update(addressDto);
		return "redirect:/address/addressXdmList"; // html이 아닌 내부에서 연결되는 주소
	}
	@RequestMapping(value = "/address/addressXdmDele")
	public String addressXdDele(AddressDto addressDto) {
		addressService.delete(addressDto);
		return "redirect:/address/addressXdmList"; // html이 아닌 내부에서 연결되는 주소
	}
	@RequestMapping(value = "/address/addressXdmUele")
	public String addressXdUele(AddressDto addressDto) {
		addressService.uelete(addressDto);
		return "redirect:/address/addressXdmList"; // html이 아닌 내부에서 연결되는 주소
	}

}
