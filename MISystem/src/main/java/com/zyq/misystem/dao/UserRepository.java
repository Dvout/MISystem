package com.zyq.misystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zyq.misystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//	@Modifying
//	@Query(value = "update user o set o.t_id=:tid where o.u_id=:uid", nativeQuery = true)
//	void bindTid(@Param("uid") String uid, @Param("tid") String tid);
	@Query(value = "select t_id  from user o where o.u_name=:name and u_pwd=:pwd", nativeQuery = true)
	String selectTidByUser(@Param("name") String name, @Param("pwd") String pwd);
}
