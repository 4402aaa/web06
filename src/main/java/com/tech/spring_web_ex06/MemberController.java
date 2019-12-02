package com.tech.spring_web_ex06;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("/memberConfirm")
	public String memberRedirect(HttpServletRequest request) {
		String id = request.getParameter("id");

		if (id.equals("tom")) {
			return "redirect:memberGood";
		}
		return "redirect:memberNoGood";
	}

	@RequestMapping("/member/memberGood")
	public String membergood() {
		return "/member/memberGood";
	}

	@RequestMapping("/member/memberNoGood")
	public String membernogood() {
		return "/member/memberNoGood";
	}
}
