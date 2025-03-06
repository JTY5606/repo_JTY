package com.JTY.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	
	@Autowired //인터페이스
	AddressService addressService;

	@RequestMapping(value = "/address/addressXdmList")
	public String addressXdmList(Model model) {
		List<AddressDto> addressDtos = new ArrayList<>();
		
		addressDtos = addressService.selectList();
		
		model.addAttribute("list", addressDtos);
		
		return "address/addressXdmList"; 
		}
	@RequestMapping(value = "/address/addressXdmItem")
	public String addressXdmItem(Model model,AddressDto addressDto) {
		
		model.addAttribute("item", addressService.selectItem(addressDto));
		return "address/addressXdmItem";
	}
	
	@RequestMapping(value = "/address/addressXdmForm")
	public String addressXdmForm() {
		
		return "address/addressXdmForm";
	}
	@RequestMapping(value = "/address/addressXdmInst")
	public String addressXdmInst(AddressDto addressDto) {
		
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		System.out.println("addressDto.getType():" + addressDto.getType());
		
		addressService.insert(addressDto);
		
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		
		return "redirect:/address/addressXdmList";
	}
	@RequestMapping(value = "/address/addressXdmMfom")
	public String addressXdmMfom(Model model, AddressDto addressDto) {
		
		System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		System.out.println("addressDto.getType():" + addressDto.getType());
		model.addAttribute("item", addressService.selectItem(addressDto));
		return "address/addressXdmMfom";
	}
	@RequestMapping(value = "/address/addressXdmUpdt")
	public String addressXdmUpdt(AddressDto addressDto) {
		
		addressService.update(addressDto);
		return "redirect:/address/addressXdmList";
	}
}
