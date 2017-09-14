package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	// JPA에서 엔티티를 관리하기 위해 준다.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	
	public enum Gender {
		M, F;
	}
	
	@Id
	@Column(precision=4)
	private BigInteger empno;
	@Column(length=10, nullable=false)
	private String ename;
	@Enumerated(EnumType.STRING)
	@Column(length=1)
	private Gender gender;
	@Column(length=9)
	private String job;
	private Integer mgr;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private Integer deptno;
}
//EMPNO	 	NUMBER(4) 				CONSTRAINT EMP_EMPNO_PK PRIMARY KEY,
//ENAME 	VARCHAR2(10 CHAR) 	NOT NULL, -- CHAR을 추가함으로써 글자단위로 변경.
// GENDER	CHAR(1 CHAR)			CONSTRAINT EMP_GENDER_CK CHECK (GENDER IN ('M', 'F')),
//JOB   	VARCHAR2(9 CHAR), 	-- 글자단위로 변경.
//MGR  		NUMBER(4),
//HIREDATE 	DATE,
//SAL 		NUMBER(7,2),
//COMM 		NUMBER(7,2),
//DEPTNO 	NUMBER(2) 				CONSTRAINT EMP_DEPTNO_FK REFERENCES DEPT);