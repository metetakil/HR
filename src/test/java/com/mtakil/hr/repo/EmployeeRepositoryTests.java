package com.mtakil.hr.repo;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mtakil.hr.entity.Employee;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void testFindById() {
		Optional<Employee> emp = employeeRepository.findById(7L);
		assertTrue(emp.isPresent());
		assertTrue(emp.get().getId() == 7);
	}
	
}
