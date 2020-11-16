package com.system.employee;

import java.time.LocalDate;

public class Employee {
	
	public Integer employeeCode;
	public String employeeName;
	public Integer employeeAge;
	public Integer employeeContactNumber;
	public LocalDate employeeDOB;
	public Integer employeeWorkHours;
	public String employeeStatus;
	public boolean isWorking;
	public long employeeSalary;
	
	public Employee() {}

	public Employee(Integer employeeCode, String employeeName, Integer employeeAge, Integer employeeContactNumber,
			LocalDate employeeDOB, Integer employeeWorkHours, String employeeStatus, boolean isWorking,
			long employeeSalary) {
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeContactNumber = employeeContactNumber;
		this.employeeDOB = employeeDOB;
		this.employeeWorkHours = employeeWorkHours;
		this.employeeStatus = employeeStatus;
		this.isWorking = isWorking;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + ", employeeContactNumber=" + employeeContactNumber + ", employeeDOB=" + employeeDOB
				+ ", employeeWorkHours=" + employeeWorkHours + ", employeeStatus=" + employeeStatus + ", isWorking="
				+ isWorking + ", employeeSalary=" + employeeSalary + "]";
	}

	public Integer getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Integer employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Integer getEmployeeContactNumber() {
		return employeeContactNumber;
	}

	public void setEmployeeContactNumber(Integer employeeContactNumber) {
		this.employeeContactNumber = employeeContactNumber;
	}

	public LocalDate getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(LocalDate employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public Integer getEmployeeWorkHours() {
		return employeeWorkHours;
	}

	public void setEmployeeWorkHours(Integer employeeWorkHours) {
		this.employeeWorkHours = employeeWorkHours;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}
