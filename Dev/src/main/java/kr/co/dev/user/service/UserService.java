package kr.co.dev.user.service;

import org.springframework.web.servlet.ModelAndView;

public interface UserService {
	
	public ModelAndView regUser(String id, String password, String name, String country, int age, String email, String address, String phone) throws Exception;

	public ModelAndView login(String id, String password)throws Exception;
	
	
	
}
