package com.JTY.fapp.club;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClubController {
	
	@Autowired //인터페이스
	ClubService clubService;

	@RequestMapping(value = "/club/clubXdmList")
	public String clubXdmList(Model model) {
		model.addAttribute("list", clubService.selectList());
		
		return "club/clubXdmList"; 
		}

}
