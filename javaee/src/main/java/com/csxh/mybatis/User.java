package com.csxh.mybatis;

import java.util.List;

import com.csxh.mybatis.dao.UserDAO;
import com.csxh.mybatis.model.User;

/**
 * 
 */

/**
 * @author karthy
 *
 */
public class User {

	public static void main(String[] args) {

		UserDAO userDAO = new UserDAO();

		User user = new User();
		user.setUserId(100);
		user.setEmailId("info@karthy.me");
		user.setFirstName("karthikeyan");
		user.setLastName("sadayamuthu");
		user.setPassword("password");

		// add new user
		userDAO.insertUser(user);

		// get user by id
		User userbyId = userDAO.getUserById(100);

		// update user password
		user = new User();
		user.setUserId(100);
		user.setPassword("password123");
		userDAO.updateUser(user);

		// delete User
		userDAO.deleteUser(100);

		// get all user
		List<User> userList = userDAO.getAllUsers();
	}

}
