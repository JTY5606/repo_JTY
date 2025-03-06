package com.JTY.fapp.birthday;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BirthdayController {
	
	@Autowired //인터페이스
	BirthdayService birthdayService;

	@RequestMapping(value = "/birthday/birthdayXdmList")
	public String birthdayXdmList(Model model) {
		List<BirthdayDto> birthdayDtos = new ArrayList<>();
		
		birthdayDtos = birthdayService.selectList();
		
		model.addAttribute("list", birthdayDtos);
		
		return "birthday/birthdayXdmList"; 
		}
	@RequestMapping(value = "/birthday/birthdayXdmDate")
	public String birthdayXdmDate(Model model,BirthdayDto birthdayDto) {
		
		System.out.println("birthdayDto.getSeq(): " + birthdayDto.getSeq());
		model.addAttribute("date",birthdayService.selectDate(birthdayDto));
		return "birthday/birthdayXdmDate";
	}
	
	@RequestMapping(value = "/birthday/birthdayXdmForm")
	public String birthdayXdmForm() {
		
		
		return "birthday/birthdayXdmForm";
	}
	@RequestMapping(value = "/birthday/birthdayXdmInst")
	public String birthdayXdmInst(BirthdayDto birthdayDto) {
		
		System.out.println("birthdayDto.getMain() : " + birthdayDto.getMain());
		System.out.println("birthdayDto.getType() : " + birthdayDto.getType());
		System.out.println("birthdayDto.getDate() : " + birthdayDto.getDate());
		System.out.println("birthdayDto.getMember_seq() : " + birthdayDto.getMember_seq());
		
		
		birthdayService.insert(birthdayDto);
		System.out.println("birthdayDto.getSeq() : " + birthdayDto.getSeq());
		
		return "redirect:/birthday/birthdayXdmList";
		
	}
	@RequestMapping(value = "/birthday/birthdayXdmMfom")
	public String birthdayXdmMfom(Model model,BirthdayDto birthdayDto) {
		
		model.addAttribute("date",birthdayService.selectDate(birthdayDto));
		
		return "birthday/birthdayXdmMfom";
	}
	@RequestMapping(value = "/birthday/birthdayXdmUpdt")
	public String birthdayXdmUpdt(BirthdayDto birthdayDto) {
		System.out.println("birthdayDto.getSeq():" + birthdayDto.getSeq());
		System.out.println("birthdayDto.getMain():" + birthdayDto.getMain());
		System.out.println("birthdayDto.getType():" + birthdayDto.getType());
		System.out.println("birthdayDto.getDate():" + birthdayDto.getDate());
		System.out.println("birthdayDto.getMember_seq():" + birthdayDto.getMember_seq());
		birthdayService.update(birthdayDto);
		return "redirect:/birthday/birthdayXdmList";
		
	}
}
