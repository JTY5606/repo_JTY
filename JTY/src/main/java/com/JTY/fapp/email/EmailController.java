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
	@RequestMapping(value = "/email/emailXdmEmail")
	public String emailXdmEmail(Model model, EmailDto emailDto) {
		
		System.out.println("emailDto.getSeq(): " + emailDto.getSeq());
		model.addAttribute("email", emailService.selectEmail(emailDto));
		return "email/emailXdmEmail";
	}
	
	@RequestMapping(value = "/email/emailXdmForm")
	public String emailXdmForm() {
		
		
		return "email/emailXdmForm";
	}
	@RequestMapping(value = "/email/emailXdmInst")
	public String emailXdmInst(EmailDto emailDto) {
		
		System.out.println("emailDto.getMain():" + emailDto.getMain());
		System.out.println("emailDto.getEmail():" + emailDto.getEmail());
		System.out.println("emailDto.getMember_seq():" + emailDto.getMember_seq());
		
		emailService.insert(emailDto);
		
		System.out.println("emailDto.getSeq():" + emailDto.getSeq());
		return "redirect:/email/emailXdmList";
	}
}
