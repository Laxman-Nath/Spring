package com.spring.queries;

import java.util.List;

import com.spring.entities.Employee;

public interface QueryInterface {
public int insert(Employee emp);
public int update(Employee emp);
public int delete(int id);
public Employee getStudent(int id);
public List<Employee> getAllEmployees();
}
