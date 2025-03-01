package com.JTY.fapp.member;

import java.util.ArrayList;
import java.util.List;

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
		List<MemberDto> memberDtos = new ArrayList<>();
		
		memberDtos = memberService.selectList();
		
		model.addAttribute("list", memberDtos);
		
		return "member/memberXdmList"; 
		}
}
