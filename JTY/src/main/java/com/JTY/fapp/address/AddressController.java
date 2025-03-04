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
	
	

}
