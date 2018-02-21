package com.example.demo.validation;

import com.example.demo.model.Employee;

/**
 * @author JThakur
 *
 */
public interface IValidation {
	public String empName(String name);

	public String empEmail(String email);

	public String password(String pass);

	public String equal(String pass, String conf);
	
	public String employeData(Employee emp);

	public boolean valid();
}
