package com.zyq.misystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.zyq.misystem.entity.User;
import com.zyq.misystem.utils.CommonUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService service;
	
	@Test
	@Transactional
	@Rollback(false)
	public void test() {
		String tid = CommonUtils.getRandId();
		User user = service.getUserById("69ff25c9d01");
		user.setTid(tid);
		service.updateUser(user);
	}
	
//	@Test
//	@Transactional
//	public void test1() {
//		List<User> users = service.getUsers();
//		User user = users.get(1);
////		System.out.println(user.getUid());
//		User newuser = service.getUserById(user.getUid());
//		System.err.println(newuser);
//	}

}
