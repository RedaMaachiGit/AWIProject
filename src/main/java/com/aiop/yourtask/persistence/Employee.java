package com.aiop.yourtask.persistence;

import javax.persistence.*;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employeeId")
	private int employeeId;
	
	@Column(name="testName")
	private String testName;
	
	@Column(name="testDescription")
	private String testDescription;
	
	public Employee() {
	}
	
	public Employee(int employeeId, String testName, String testDescription) {
		this.employeeId = employeeId;
		this.testName = testName;
		this.testDescription = testDescription;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return testName;
	}
	public void setEmployeeName(String testName) {
		this.testName = testName;
	}
	public String getDeptId() {
		return testDescription;
	}
	public void setDeptId(String testDescription) {
		this.testDescription = testDescription;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", testName=" + testName + ", testDescription=" + testDescription
				+ "]";
	}
	
}