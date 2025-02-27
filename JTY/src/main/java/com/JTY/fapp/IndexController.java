package com.JTY.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping(value = "/index2")
	public String index2() {
		return "abc/inddex";
	}
	
	
	
//	/helloWorld
//	helloWorld
	@RequestMapping(value = "/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
//	/aaa/bbb
//	bbb/aaa
	@RequestMapping(value = "/aaa/bbb")
	public String aaabbb() {
		return "bbb/aaa";
	}
//	/xxx/yyy/zzz
//	yyy/zzz
	@RequestMapping(value = "/xxx/yyy/zzz")
	public String xxxyyyzzz() {
		return "yyy/zzz";
	}
//	/ttt/yyy
//	zzz/yyy/xxx
	@RequestMapping(value = "/ttt/yyy")
	public String tttyyy() {
		return "zzz/yyy/xxx";
	}
//	/infra/member/loginXdmForm
//	adm/v1/tmpname/infra/member/loginForm
	@RequestMapping(value = "/infra/member/loginXdmForm")
	public String loginXdmForm() {
		return "adm/v1/tmpname/infra/member/loginForm";
	}
//	/infra/codegroup/codeGroupXdmList
//	adm/v1/tmpname/infra/codegroup/codeGroupList
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupList";
	}
//	
//	/infra/codegroup/codeGroupXdmForm
//	adm/v1/tmpname/infra/codegroup/codeGroupForm

	@RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
	}
//	/infra/member/loginUsrForm
//	usr/v1/tmpname/infra/member/loginForm
	@RequestMapping(value = "/infra/member/loginUsrForm")
	public String loginUsrForm() {
		return "user/v1/tmpname/infra/member/loginForm";
	}
}
