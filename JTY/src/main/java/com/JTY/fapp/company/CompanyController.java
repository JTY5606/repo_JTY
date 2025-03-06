package com.JTY.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

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
	@RequestMapping(value = "/company/companyXdmItem")
	public String companyXdmItem(Model model, CompanyDto companyDto) {
		
		System.out.println("companyDto.getSeq(): "+ companyDto.getSeq());
		model.addAttribute("item", companyService.selectItem(companyDto));
		return "company/companyXdmItem";
	}

	@RequestMapping(value = "/company/companyXdmForm")
	public String companyXdmForm() {
		
		return "company/companyXdmForm";
	}
	@RequestMapping(value = "/company/companyXdmInst")
	public String companyXdmInst(CompanyDto companyDto) {
		
		System.out.println("companyDto.getMain(): " + companyDto.getMain());
		System.out.println("companyDto.getCompany(): " + companyDto.getCompany());
		System.out.println("companyDto.getDepartment(): " + companyDto.getDepartment());
		System.out.println("companyDto.getPosition(): " + companyDto.getPosition());
		System.out.println("companyDto.getMember_seq(): " + companyDto.getMember_seq());
		
		companyService.insert(companyDto);
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		return "redirect:/company/companyXdmList";
	}
	@RequestMapping(value = "/company/companyXdmMfom")
	public String companyXdmMfom(Model model, CompanyDto companyDto) {
		
		model.addAttribute("item", companyService.selectItem(companyDto));
		return "company/companyXdmMfom";
	}
	@RequestMapping(value = "/company/companyXdmUpdt")
	public String companyXdmUpdt(CompanyDto companyDto) {
		
		companyService.update(companyDto);
		return "redirect:/company/companyXdmList";
	}
}
