package com.mtakil.hr.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhoneContact extends Contact {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id", nullable = false)
	private Employee employee;
	
	private String phoneNumber;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("PhoneContact id: %s, phoneNumber: %s", id, phoneNumber);
	}
	
}
