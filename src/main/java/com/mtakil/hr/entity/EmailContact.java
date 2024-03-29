package com.mtakil.hr.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class EmailContact extends Contact {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id", nullable = false)
	private Employee employee;

	private String email;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("EmailContact id: %s, email: %s", id, email);
	}
	
}
