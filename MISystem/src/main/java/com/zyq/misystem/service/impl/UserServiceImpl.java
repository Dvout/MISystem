package com.zyq.misystem.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyq.misystem.dao.UserRepository;
import com.zyq.misystem.entity.User;
import com.zyq.misystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(String uid) {
		return userRepository.getOne(uid);
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	/**
	 * 这里只更新部分字段可能会有问题，可能需要重写update方法
	 */
	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

//	@Override
//	public void bindTid(String uid, String tid) {
//		userRepository.bindTid(uid, tid);
//		userRepository.flush();
//	}
	@Override
	public String getUidByUser(String name, String pwd) {
		return userRepository.selectTidByUser(name, pwd);
	}

	@Override
	public void bindTid(String uid, String tid) {
		// TODO Auto-generated method stub
		
	}

}
