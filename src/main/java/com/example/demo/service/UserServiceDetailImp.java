package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployee;
import static java.util.Collections.emptyList;
/**
 * @author JThakur
 *
 */
public class UserServiceDetailImp implements UserDetailsService {
	@Autowired
	IEmployee employee;
	
	public UserServiceDetailImp(IEmployee employee) {
		this.employee=employee;
	}

	@Override
	public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
		Employee empData=employee.findUser(user);
		if(empData==null) {
			throw new UsernameNotFoundException(user);
		}
		return new User(empData.getEmpName(), empData.getEmpPass(),emptyList());
	}

}
