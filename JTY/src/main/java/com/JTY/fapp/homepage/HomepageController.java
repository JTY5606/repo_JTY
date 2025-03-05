package com.JTY.fapp.homepage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	
	@Autowired //인터페이스
	HomepageService homepageService;

	@RequestMapping(value = "/homepage/homepageXdmList")
	public String homepageXdmList(Model model) {
		List<HomepageDto> homepageDtos = new ArrayList<>();
		
		homepageDtos = homepageService.selectList();
		
		model.addAttribute("list", homepageDtos);
		
		return "homepage/homepageXdmList"; 
		}
	
	@RequestMapping(value = "/homepage/homepageXdmItem")
	public String homepageXdmItem(Model model,HomepageDto homepageDto) {
		
		System.out.println("homepage.getSeq():" + homepageDto.getSeq());
		model.addAttribute("item",homepageService.selectItem(homepageDto));
		return "homepage/homepageXdmItem";
	}

}
