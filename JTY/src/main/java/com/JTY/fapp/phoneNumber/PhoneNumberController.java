package com.JTY.fapp.phoneNumber;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneNumberController {
	
	@Autowired //인터페이스
	PhoneNumberService PhoneNumberService;

	@RequestMapping(value = "/phoneNumber/phoneNumberXdmList")
	public String PhoneNumberXdmList(Model model) {
		List<PhoneNumberDto> PhoneNumberDtos = new ArrayList<>();
		
		PhoneNumberDtos = PhoneNumberService.selectList();
		
		model.addAttribute("list", PhoneNumberDtos);
		
		return "phoneNumber/phoneNumberXdmList"; 
		}

}
