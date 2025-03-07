package com.JTY.fapp.phoneNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneNumberController {
	
	@Autowired
	PhoneNumberService phoneNumberService;
	
	@RequestMapping(value = "/phoneNumber/phoneNumberXdmList")
	public String phoneNumberXdmList(Model model) {
		model.addAttribute("list", phoneNumberService.selectList());
		
		return "phoneNumber/phoneNumberXdmList";
	}
	@RequestMapping(value = "/phoneNumber/phoneNumberXdmItem")
	public String phoneNumberXdmItem(Model model, PhoneNumberDto phoneNumberDto) {
		model.addAttribute("item", phoneNumberService.selectItem(phoneNumberDto));
		
		return "phoneNumber/phoneNumberXdmItem";
	}
	@RequestMapping(value = "/phoneNumber/phoneNumberXdmForm")
	public String phoneNumberXdmForm() {
		
		return "phoneNumber/phoneNumberXdmForm";
	}
	@RequestMapping(value = "/phoneNumber/phoneNumberXdmInst")
	public String phoneNumberXdmInst(PhoneNumberDto phoneNumberDto) {

		phoneNumberService.insert(phoneNumberDto);
		return "redirect:/phoneNumber/phoneNumberXdmList";
	}

}
