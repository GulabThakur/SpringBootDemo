package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Employee;

/**
 * @author JThakur
 *
 */

public interface IEmployee extends JpaRepository<Employee, Long> {
	Employee findUser(String emp);
}
