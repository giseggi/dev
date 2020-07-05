package kr.co.dev.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dev.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	@RequestMapping(value="listPage")
	public ModelAndView listPage() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv = service.listPage();
		
		return mv;
		
	}
	
}
