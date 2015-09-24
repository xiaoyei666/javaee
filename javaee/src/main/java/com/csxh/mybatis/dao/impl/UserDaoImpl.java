package com.csxh.mybatis.dao.impl;

import java.util.List;

import com.csxh.mybatis.dao.UserDao;
import com.csxh.mybatis.model.User;
import com.csxh.mybatis.util.MyBatisSessionUtil;

import org.apache.ibatis.session.SqlSession;

/**
 * @author karthy
 *
 */
public class UserDaoImpl {

	public void insertUser(User user) {
		SqlSession sqlSession = MyBatisSessionUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserDao userMapper = sqlSession.getMapper(UserDao.class);
			userMapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public User getUserById(Integer userId) {
		SqlSession sqlSession = MyBatisSessionUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserDao userMapper = sqlSession.getMapper(UserDao.class);
			return userMapper.getUserById(userId);
		} finally {
			sqlSession.close();
		}
	}

	public List<User> getAllUsers() {
		SqlSession sqlSession = MyBatisSessionUtil.getSqlSessionFactory()
				.openSession();
		List<User> userList = null;
		try {
			UserDao userMapper = sqlSession.getMapper(UserDao.class);
			userList = userMapper.getAllUsers();
			return userList;

		} finally {
			sqlSession.close();
		}
	}

	public void updateUser(User user) {
		SqlSession sqlSession = MyBatisSessionUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserDao userMapper = sqlSession.getMapper(UserDao.class);
			userMapper.updateUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

	}

	public void deleteUser(Integer userId) {
		SqlSession sqlSession = MyBatisSessionUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserDao userMapper = sqlSession.getMapper(UserDao.class);
			userMapper.deleteUser(userId);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

	}
}
