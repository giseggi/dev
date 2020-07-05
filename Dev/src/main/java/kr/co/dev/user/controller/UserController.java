package kr.co.dev.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dev.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@RequestMapping("/")
	public String init() {
		
		
		return "home";
	}
	
	
	@RequestMapping(value="/moveRegUser")
	public ModelAndView moveRegUser() {
		
		ModelAndView mv = new ModelAndView(); 
		
		mv.setViewName("regUser");
		
		return mv;
	}
	
	
	@RequestMapping(value="/regUser")
	public ModelAndView regUser(String id, String password, String name, String country,int age, String email, String address, String phone ) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv = service.regUser(id, password, name, country, age, email, address, phone);
		
		return mv;
		
	}
	
	@RequestMapping(value="/moveLogin")
	public ModelAndView moveLogin() {
		
		ModelAndView mv = new ModelAndView(); 
		
		mv.setViewName("login");
		
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(String id, String password) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv = service.login(id, password);
		
		return mv;
		
	}
}
