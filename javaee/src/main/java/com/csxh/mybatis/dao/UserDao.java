
package com.csxh.mybatis.dao;

import java.util.List;

import com.csxh.mybatis.model.User;

/**
 * 
 * @author karthy
 *
 */
public interface UserDao {

	public void insertUser(User user);

	public User getUserById(Integer userId);

	public List<User> getAllUsers();

	public void updateUser(User user);

	public void deleteUser(Integer userId);

}
