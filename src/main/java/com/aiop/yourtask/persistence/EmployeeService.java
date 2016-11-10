package com.aiop.yourtask.persistence;

import java.util.List;

public class EmployeeService {

	private static EmployeeDao employeeDao;

	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}

	public void persist(Employee entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.persist(entity);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public void update(Employee entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.update(entity);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public Employee findById(int id) {
		employeeDao.openCurrentSession();
		Employee employee = employeeDao.findById(id);
		employeeDao.closeCurrentSession();
		return employee;
	}

	/*
	public void delete(int id) {
		employeeDao.openCurrentSessionwithTransaction();
		Employee employee = employeeDao.findById(id);
		employeeDao.delete(employee);
		employeeDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Employee entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.delete(entity);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public List<Employee> findAll() {
		employeeDao.openCurrentSession();
		List<Employee> employees = employeeDao.findAll();
		employeeDao.closeCurrentSession();
		return employees;
	}

	public void deleteAll() {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.deleteAll();
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public EmployeeDao employeeDao() {
		return employeeDao;
	}
	
}
