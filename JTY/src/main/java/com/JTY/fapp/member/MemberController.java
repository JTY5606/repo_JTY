package com.JTY.fapp.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired //인터페이스
	MemberService memberService;

	@RequestMapping(value = "/member/memberXdmList")
	public String memberXdmList(Model model) {
		

		model.addAttribute("list", memberService.selectList());
		
		return "member/memberXdmList"; 
		}
	
	@RequestMapping(value = "/member/memberXdmView")
	public String memberXdmView(Model model) {
		model.addAttribute("item", memberService.selectOne());
		return "member/memberXdmView";
	}
}
