package com.zyq.misystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zyq.misystem.entity.Result;

@Repository
@Transactional
public interface ResultRepositiry extends JpaRepository<Result, String> {

}
