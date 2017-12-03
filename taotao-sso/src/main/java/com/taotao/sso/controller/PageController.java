package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面跳转
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/page")
public class PageController {
	
	@RequestMapping("/register")
	public String showRegister(){
		return "register";
	}
	
	@RequestMapping("/login")
	public String showLogin(Model model,String redirect){
		model.addAttribute("redirect", redirect);
		return "login";
	}
}
