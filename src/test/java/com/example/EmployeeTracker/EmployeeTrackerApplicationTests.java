package com.example.EmployeeTracker;

import com.example.EmployeeTracker.models.Employee;
import com.example.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Mark", 46, 123456789, "mark@yahoo.com");
		Employee employee2 = new Employee("Slav", 41, 923456789, "slav@yahoo.com");
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

}
