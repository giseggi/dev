package kr.co.dev.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dev.board.dao.BoardDao;
import kr.co.dev.board.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public ModelAndView listPage() throws Exception {

		List<BoardDto> result = dao.listPage();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("board");
		
		
		return mv;
	}
	

		
	
}
