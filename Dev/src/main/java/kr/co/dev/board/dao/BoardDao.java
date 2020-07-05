package kr.co.dev.board.dao;

import java.util.List;

import kr.co.dev.board.dto.BoardDto;

public interface BoardDao {
	
	public List<BoardDto> listPage() throws Exception;

}
