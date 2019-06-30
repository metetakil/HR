package com.mtakil.hr.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Contact extends BaseEntity {

	protected Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
