package com.mtakil.hr.repo;

import org.springframework.data.repository.CrudRepository;

import com.mtakil.hr.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
