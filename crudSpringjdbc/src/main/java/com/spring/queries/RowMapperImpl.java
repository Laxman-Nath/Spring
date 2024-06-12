package com.spring.queries;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
//		emp.setId(rs.getInt(1));
//		emp.setName(rs.getString(2));
//		emp.setAddress(rs.getString(3));
		return emp;
	}

}
