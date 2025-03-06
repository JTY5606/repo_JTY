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
	
	@RequestMapping(value = "/member/memberXdmAll")
	public String memberXdmAll(Model model, MemberDto memberDto) {
		
		System.out.println("memberDto.getSeq():" + memberDto.getSeq());
		model.addAttribute("d",memberService.selectAll(memberDto));
		return "member/memberXdmAll";
	}
	@RequestMapping(value = "/member/memberXdmForm")
	public String memberXdmForm() {
		
		return "member/memberXdmForm";
	}
	
	@RequestMapping(value = "/member/memberXdmInst")
	public String memberXdmInst(MemberDto memberDto) {
		
		System.out.println("memberDto.getLastName(): " + memberDto.getLastName());
		System.out.println("memberDto.getName(): " + memberDto.getName());
		System.out.println("memberDto.getNaverId(): " + memberDto.getNaverId());
		System.out.println("memberDto.getMemo(): " + memberDto.getMemo());
		System.out.println("memberDto.getNickName(): " + memberDto.getNickname());
		
		memberService.insert(memberDto);
		
		System.out.println("memberDto.getSeq(): " + memberDto.getSeq());
		return "redirect:/member/memberXdmList";
	}
	@RequestMapping(value = "/member/memberXdmMfom")
	public String memberXdmMfom(Model model,MemberDto memberDto) {
		
		model.addAttribute("item", memberService.selectOne(memberDto));
		return "member/memberXdmMfom";
	}
	
	@RequestMapping(value = "/member/memberXdmUpdt")
	public String memberXdmUpdt(MemberDto memberDto) {
		
		memberService.update(memberDto);
		return "redirect:/member/memberXdmList";
	}
}
