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

}
