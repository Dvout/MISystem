package com.zyq.misystem.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyq.misystem.entity.Teacher;

@Repository
@Transactional
public interface TeacherRepository extends JpaRepository<Teacher, String> {

}
