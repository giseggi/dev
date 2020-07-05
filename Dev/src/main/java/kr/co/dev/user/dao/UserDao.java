package kr.co.dev.user.dao;

import kr.co.dev.user.dto.User;

public interface UserDao {
	
	public int regUser(String id, String password, String name, String country, int age, String email, String address, String phone) throws Exception;

	public User login(String id, String password)throws Exception;
}
