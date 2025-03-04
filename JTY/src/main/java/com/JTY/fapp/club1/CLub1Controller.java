package com.JTY.fapp.club1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CLub1Controller {
	
	@Autowired //인터페이스
	Club1Service clubService;

	@RequestMapping(value = "/club1/club1XdmList")
	public String club1XdmList(Model model) {
		List<Club1Dto> club1Dtos = new ArrayList<>();
		
		club1Dtos = clubService.selectList();
		
		model.addAttribute("list", club1Dtos);
		
		return "club1/club1XdmList"; 
		}

}
