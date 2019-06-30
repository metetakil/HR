package com.mtakil.hr.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Project extends BaseEntity {

	private String projectName;
	
	private Long budget;
	
	@ManyToMany(mappedBy = "projectList")
	private Set<Employee> employeeList = new HashSet<Employee>();
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return String.format("Project id: %s, projectName: %s, budget: %s", id, projectName, budget);
	}
	
}
