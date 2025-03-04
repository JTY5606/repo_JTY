package com.JTY.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {
	
	@Autowired //인터페이스
	CompanyService companyService;

	@RequestMapping(value = "/company/companyXdmList")
	public String companyXdmList(Model model) {
		List<CompanyDto> companyDtos = new ArrayList<>();
		
		companyDtos = companyService.selectList();
		
		model.addAttribute("list", companyDtos);
		
		return "company/companyXdmList"; 
		}

}
