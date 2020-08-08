package com.speech.tmt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.speech.tmt.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Override
	public List<Employee> findAll();
}
