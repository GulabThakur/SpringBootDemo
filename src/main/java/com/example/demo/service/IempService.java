package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

/**
 * @author JThakur
 *
 */
public interface IempService {

	public void addemp(Employee emp);

	public void delete(Long empId);

	public Employee getEmp(Long email);

	public void update(Employee emp);

	public List<Employee> allEmp();

}
