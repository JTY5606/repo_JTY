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
	public String memberXdmView(Model model, MemberDto memberDto) {
		
		System.out.println("memberDto.getSeq(): " + memberDto.getSeq());
		
		model.addAttribute("item", memberService.selectOne(memberDto));
		return "member/memberXdmView";
	}
	@RequestMapping(value = "/member/memberXdmName")
	public String memberXdmName(Model model, MemberDto memberDto) {
		
		System.out.println("memberDto.getSeq(): " + memberDto.getSeq());
		model.addAttribute("a", memberService.selectTwo(memberDto));
		return "member/memberXdmName";
	}
	
	@RequestMapping(value = "/member/memberXdmId")
	public String memberXdmId(Model model, MemberDto memberDto) {
		
		System.out.println("memberDto.getSeq():" + memberDto.getSeq());
		model.addAttribute("b", memberService.selectB(memberDto));
		return "member/memberXdmId";
	}
	@RequestMapping(value = "/member/memberXdmMemo")
	public String memberXdmMemo(Model model, MemberDto memberDto) {
		
		System.out.println("memberDto.getSeq():" + memberDto.getSeq());
		model.addAttribute("c",memberService.selectC(memberDto));
		return "member/memberXdmMemo";
	}
}
