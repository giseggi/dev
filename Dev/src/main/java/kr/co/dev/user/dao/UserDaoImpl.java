package kr.co.dev.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dev.user.dto.User;


@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public int regUser(String id, String password, String name, String country, int age, String email, String address,
			String phone) throws ClassNotFoundException, SQLException {
		
		String dbId = "root";
		String dbPassword = "";//localhost:3306/test?
		String url = "jdbc:mysql://localhost:3306/dev?serverTimezone=UTC&useUnicode=true& useUnicode=true&characterEncoding=utf-8";
		   
		Class.forName("com.mysql.jdbc.Driver");
		   
		Connection conn = DriverManager.getConnection(url, dbId, dbPassword);
		
		String sql = "insert into userInfo(id, password, name, country, age, email, address, phone) values(?,?,?,?,?,?,?,?)";		
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3, name);
		ps.setString(4, country);
		ps.setInt(5, age);
		ps.setString(6, email);
		ps.setString(7, address);
		ps.setString(8, phone);
		
		int result = ps.executeUpdate();

		
		
		return result;
	}

	@Override
	public User login(String id, String password) throws Exception {

		String dbId = "root";
		String dbPassword = "";//localhost:3306/test?
		String url = "jdbc:mysql://localhost:3306/dev?serverTimezone=UTC&useUnicode=true& useUnicode=true&characterEncoding=utf-8";
		   
		Class.forName("com.mysql.jdbc.Driver");
		   
		Connection conn = DriverManager.getConnection(url, dbId, dbPassword);
		
		String sql = "select * from userinfo where id = ? and password = ? ";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		User user = null;
		
		//rs.last();
		
		if(rs.next()) {
					
			user = new User();
			user.setName(rs.getString("name"));
			user.setCountry(rs.getString("country"));
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getString("phone"));
			user.setReg_date(rs.getString("reg_date"));
			user.setAuth(rs.getInt("auth"));
		}	
		
		return user;	
	
			
	}

}
