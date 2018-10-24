package com.zyq.misystem.service;

import java.util.List;

import com.zyq.misystem.entity.User;

public interface UserService {
	List<User> getUsers();

	User getUserById(String uid);

	void addUser(User user);

	void updateUser(User user);

	void bindTid(String uid,String tid);

	String getUidByUser(String name, String pwd);
}
