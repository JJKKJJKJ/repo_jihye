package com.qwer.fapp;

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
	 @RequestMapping(value = "/helloWorld")
	 public String index3() {
		 return "helloWorld";
	 }
	 @RequestMapping(value = "/aaa/bbb")
	 public String aaa_bbb() {
		 return "bbb/aaa";
	 }
	 @RequestMapping(value = "/xxx/yyy/zzz")
	 public String xxx_yyy_zzz() {
		 return "yyy/zzz";
	 }
	 @RequestMapping(value = "/ttt/yyy")
	 public String ttt_yyy() {
		 return "zzz/yyy/xxx";
	 }
	 @RequestMapping(value = "/infra/member/loginXdmForm")
	 public String infra_member_loginXdmForm() {
		 return "adm/v1/tmpname/infra/member/loginForm";
	 }
	 @RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	 public String infra_codegroup_codeGroupXdmList() {
		 return "adm/v1/tmpname/infra/codegroup/codeGroupList";
	 }
	 @RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
	 public String infra_codegroup_codeGroupXdmForm() {
		 return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
	 }
	 @RequestMapping(value = "/infra/member/loginUsrForm")
	 public String infra_member_loginUsrForm() {
		 return "usr/v1/tmpname/infra/member/loginForm";
	 }
}
