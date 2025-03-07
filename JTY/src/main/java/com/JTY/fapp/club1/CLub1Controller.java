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
	Club1Service club1Service;

	@RequestMapping(value = "/club1/club1XdmList")
	public String club1XdmList(Model model) {
		
		
		model.addAttribute("list", club1Service.selectList());
		
		return "club1/club1XdmList"; 
		}
	@RequestMapping(value = "/club1/club1XdmItem")
	public String club1XdmItem(Model model, Club1Dto club1Dto) {
		
		
		model.addAttribute("item", club1Service.selectItem(club1Dto));
		
		return "club1/club1XdmItem"; 
		}
	@RequestMapping(value = "/club1/club1XdmForm")
	public String club1XdmForm(Model model, Club1Dto club1Dto) {
		
		
		model.addAttribute("item", club1Service.selectItem(club1Dto));
		return "club1/club1XdmForm"; 
		}
	@RequestMapping(value = "/club1/club1XdmInst")
	public String club1XdmInst(Club1Dto club1Dto) {
		
		
		club1Service.insert(club1Dto);
		return "redirect:/club1/club1XdmList"; 
		}
	@RequestMapping(value = "/club1/club1XdmMfom")
	public String club1XdmMfom(Model model, Club1Dto club1Dto) {
		
		model.addAttribute("item" , club1Service.selectItem(club1Dto));
		return "club1/club1XdmMfom"; 
		}
	@RequestMapping(value = "/club1/club1XdmUpdt")
	public String club1XdmUpdt(Club1Dto club1Dto) {
		
		club1Service.update(club1Dto);
		return "redirect:/club1/club1XdmList"; 
		}
	@RequestMapping(value = "/club1/club1XdmDele")
	public String club1XdmDele(Club1Dto club1Dto) {
		
		club1Service.delete(club1Dto);
		return "redirect:/club1/club1XdmList"; 
		}
	@RequestMapping(value = "/club1/club1XdmUele")
	public String club1XdmUele(Club1Dto club1Dto) {
		
		club1Service.uelete(club1Dto);
		return "redirect:/club1/club1XdmList"; 
		}
}
