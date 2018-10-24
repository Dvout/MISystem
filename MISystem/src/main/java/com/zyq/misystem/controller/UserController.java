package com.zyq.misystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyq.misystem.entity.Teacher;
import com.zyq.misystem.entity.User;
import com.zyq.misystem.service.UserService;
import com.zyq.misystem.utils.CommonUtils;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = { "/register" }, method = { RequestMethod.GET })
	@ResponseBody
	public void register(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String uid = CommonUtils.getRandId();
		User user = new User(uid, username, password, null);
		userService.addUser(user);
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest req){
		System.out.println("login");
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		if(userService.getUidByUser(username, password) != null) {
////			Teacher teacher = teacherService.XXX();//如果已绑定教师信息则显示教师信息
////			req.setAttribute("teacher", teacher);
////			req.setAttribute("isbind", true);
//		}else {//否则,填写教师信息
////			req.setAttribute("isbind", false);
//		}
		return "teacher/teacherinfo";
	}
}
