package com.JTY.fapp.email;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;

	@RequestMapping(value = "/email/emailXdmList")
	public String emailXdmList(Model model) {
		List<EmailDto> emailDtos = new ArrayList<>();
		
		emailDtos = emailService.selectList();
		
		model.addAttribute("list", emailDtos);
		
		return "email/emailXdmList";
		
	}
}
