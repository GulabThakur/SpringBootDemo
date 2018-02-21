package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


/**
 * @author JThakur
 *
 */
@Entity(name="EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPID")
	int empId;
	@Column(name="EMPNAME")
	String empName;
	@Column(name="EMPEMAIL",unique=true)
	String empEmail;
	@Column(name="EMPPASS")
	String empPass;
	@Transient
	String empConf;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	public String getEmpConf() {
		return empConf;
	}
	public void setEmpConf(String empConf) {
		this.empConf = empConf;
	}
	
}
