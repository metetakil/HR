package com.mtakil.hr.repo;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.mtakil.hr.entity.Employee;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class EmployeeRepositoryTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void testFindById() {
		Optional<Employee> emp = employeeRepository.findById(7L);
		assertTrue(emp.isPresent());
		assertTrue(emp.get().getId() == 7);
		assertTrue(emp.get().getFirstName().equals("Mete"));
	}
	
	@Test
	@Transactional
	public void testEmployees_Projects() {
		Optional<Employee> emp = employeeRepository.findById(7L);
		assertTrue(emp.isPresent());
		assertTrue(emp.get().getFirstName().equals("Mete"));
		assertTrue(emp.get().getProjectList().size() == 1);
		assertTrue(emp.get().getProjectList().stream().findFirst().get().getProjectName().equals("Some project"));
	}
	
}
