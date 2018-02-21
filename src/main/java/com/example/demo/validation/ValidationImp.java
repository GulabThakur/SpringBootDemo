package com.example.demo.validation;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

/**
 * @author JThakur
 *
 */
@Repository("validation")
public class ValidationImp implements IValidation {

	String email;
	String pass;
	String name;
	String check;

	@Override
	public String empName(String name) {
		if (name.matches("^[a-zA-Z ]+$")) {
			return null;
		}
		name = "Please take alphabate only";
		return name;
	}

	@Override
	public String empEmail(String email) {
		if (email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
			return null;
		}
		email = "Please Enter the actual emailId";
		return email;
	}

	@Override
	public String password(String pass) {
		if (pass.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,8})")) {
			return null;
		}
		pass = "please Enter the Right password";
		return pass;
	}

	@Override
	public String equal(String pass, String conf) {
		if (pass.equals(conf)) {
			return null;
		}
		check = "password and conform password are not match";
		return check;
	}

	@Override
	public boolean valid() {
		if (email == null && pass == null && check == null && name == null) {
			return true;
		}
		return false;
	}

	@Override
	public String employeData(Employee emp) {
		if (emp.getEmpName().matches("^[a-zA-Z ]+$")
				&& emp.getEmpEmail().matches("^[^\\\\s@]+@[^\\\\s@]+\\\\.[^\\\\s@]+$")
				&& emp.getEmpPass().matches("((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,8})")
				&& emp.getEmpPass().equals(emp.getEmpConf())) {
			return null;
		}else {
			return "data unvalid";
		}
		
	}

}
