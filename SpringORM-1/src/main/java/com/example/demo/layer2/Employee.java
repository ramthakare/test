package com.example.demo.layer2;

import javax.persistence.Column;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP10")
public class Employee {
  
	@Id
	@Column(name="EMPNO")
	private int empno;
	
	@Column(name="ENAME")
	private String ename;
	
	@Column(name="JOB")
	private String  job;
	
	@Column(name="MGR")
	private int mgr;
	
	@Column(name="HIREDATE")
	private LocalDate date;
	
	@Column(name="SAL")
	private int salary;
	
	@Column(name="COMM")
	private int comm;
	
	@Column(name="DEOTNO")
	private int dno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
	
	
}
