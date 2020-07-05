package kr.co.dev.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.dev.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public List<BoardDto> listPage() throws Exception {

		String dbId = "root";
		String dbPassword = "";//localhost:3306/test?
		String url = "jdbc:mysql://localhost:3306/dev?serverTimezone=UTC&useUnicode=true& useUnicode=true&characterEncoding=utf-8";
		   
		Class.forName("com.mysql.jdbc.Driver");
		   
		Connection conn = DriverManager.getConnection(url, dbId, dbPassword);
		
		String sql = "SELECT * FROM board";
		
		PreparedStatement ps = conn.prepareStatement(sql);
			
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> boardlist = new ArrayList<BoardDto>();;
		
		while(rs.next()) {
			
			BoardDto boardDto = new BoardDto();
			
			boardDto.setBid(rs.getInt("bid"));
			boardDto.setTitle(rs.getString("title"));
			boardDto.setContent(rs.getString("content"));
			boardDto.setWriter(rs.getString("writer"));
			boardDto.setView(rs.getInt("view"));
			boardDto.setReg_date(rs.getString("reg_date"));
			boardDto.setFix_date(rs.getString("fix_date"));
			
			boardlist.add(boardDto);
			
			
		}
		
		
		return boardlist;
	}
	

		
	

}
