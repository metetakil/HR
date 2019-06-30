package com.mtakil.hr.entity;

public class PhoneContact extends Contact {

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
