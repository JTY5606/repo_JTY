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

}
