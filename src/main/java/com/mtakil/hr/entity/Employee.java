package com.mtakil.hr.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Employee extends BaseEntity {

	private String tcno;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Employee_Project", 
        joinColumns = { @JoinColumn(name = "employee_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
	private Set<Project> projectList = new HashSet<Project>();
	/*
	@OneToMany(mappedBy = "employee")
	private List<EmailContact> contactList = new ArrayList<EmailContact>();
	*/
	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Set<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(Set<Project> projectList) {
		this.projectList = projectList;
	}
/*
	public List<EmailContact> getContactList() {
		return contactList;
	}

	public void setContactList(List<EmailContact> contactList) {
		this.contactList = contactList;
	}
*/
	@Override
	public String toString() {
		return String.format("Person id: %s, tcno: %s, firstName: %s, lastName: %s, birthDate: %s", 
				id, tcno, firstName, lastName, birthDate);
	}
}
