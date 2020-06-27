package kr.co.dev.user.dao;



public interface UserDao {
	
	public int regUser(String id, String password, String name, String country, int age, String email, String address, String phone) throws Exception;
}
