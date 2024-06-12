package com.spring.queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.entities.Employee;

@Component("")
public class QueryClass implements QueryInterface{
    private JdbcTemplate jt;
	public QueryClass(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	public QueryClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	@Autowired
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(Employee emp) {
		
		return (this.jt.update("Insert into employee values(?,?,?)",emp.getId(),emp.getName(),emp.getAddress()));
	}

	@Override
	public int update(Employee emp) {
		
		return (this.jt.update("Update employee set name=?,address=? where id=?",emp.getName(),emp.getAddress(),emp.getId()));
	}

	@Override
	public int delete(int id) {
		
		return(this.jt.update("Delete from employee where id=?",id));
	}

	@Override
	public Employee getStudent(int id) {
		Employee emp=new Employee();
		RowMapper<Employee> rmp=new RowMapperImpl();
		emp=this.jt.queryForObject("Select * from employee where id=?",rmp,id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		RowMapper<Employee> rmp=new RowMapperImpl();
		List<Employee> employees=this.jt.query("Select * from employee",rmp);
		return employees;
	}

}
