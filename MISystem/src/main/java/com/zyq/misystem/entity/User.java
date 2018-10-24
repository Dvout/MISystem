package com.zyq.misystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	public User() {

	}

	public User(String uid, String name, String pwd, String tid) {
		this.uid = uid;
		this.name = name;
		this.tid = tid;
		this.pwd = pwd;
	}

	@Id
	@Column(name = "u_id")
	private String uid;

	@Column(name = "u_name")
	private String name;

	@Column(name = "t_id")
	private String tid;
	
	@Column(name="u_pwd")
	private String pwd;

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@Override
	public String toString() {
		return this.uid+","+this.name+","+this.pwd+","+this.tid;
	}
}
