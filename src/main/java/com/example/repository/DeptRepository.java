package com.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Dept;

public interface DeptRepository extends JpaRepository<Dept, BigInteger> {
	
	Dept findByLoc(String loc);	// 쿼리 메소드

	List<Dept> findByDnameOrLoc(String dname, String loc);
	List<Dept> findByDeptnoGreaterThanOrderByDnameDesc(BigInteger deptno);
	List<Dept> findByDeptnoBetween(BigInteger left, BigInteger right);
	
}
