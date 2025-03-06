package com.JTY.fapp.messenger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessengerController {
	
	@Autowired //인터페이스
	MessengerService messengerService;

	@RequestMapping(value = "/messenger/messengerXdmList")
	public String messengerXdmList(Model model) {
		List<MessengerDto> messengerDtos = new ArrayList<>();
		
		messengerDtos = messengerService.selectList();
		
		model.addAttribute("list", messengerDtos);
		
		return "messenger/messengerXdmList"; 
		}
	@RequestMapping(value = "/messenger/messengerXdmItem")
	public String messengerXdmItem(Model model, MessengerDto messengerDto) {
		
		model.addAttribute("item", messengerService.selectItem(messengerDto));
		return "messenger/messengerXdmItem"; 
		}
	@RequestMapping(value = "/messenger/messengerXdmForm")
	public String messengerXdmForm() {
		
		return "messenger/messengerXdmForm"; 
		}
	@RequestMapping(value = "/messenger/messengerXdmInst")
	public String messengerXdmInst(MessengerDto messengerDto) {
		
		messengerService.insert(messengerDto);
		return "redirect:/messenger/messengerXdmList"; 
		}
	@RequestMapping(value = "/messenger/messengerXdmMfom")
	public String messengerXdmMfom(Model model, MessengerDto messengerDto) {
		
		System.out.println("messengerDto.getSeq():" + messengerDto.getSeq());
		model.addAttribute("item" , messengerService.selectItem(messengerDto));
		return "messenger/messengerXdmMfom"; 
		}
	@RequestMapping(value = "/messenger/messengerXdmUpdt")
	public String messengerXdmUpdt(MessengerDto messengerDto) {
		
		messengerService.update(messengerDto);
		return "redirect:/messenger/messengerXdmList"; 
		}
}
