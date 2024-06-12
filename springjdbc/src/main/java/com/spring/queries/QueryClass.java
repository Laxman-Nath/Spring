package com.spring.queries;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.spring.entities.Student;

public class QueryClass implements QueryInterface {
  private JdbcTemplate jt;
	@Override
	public int insert(Student st) {
		String query="Insert into student values(?,?,?)";
		
		return (this.jt.update(query,st.getId(),st.getName(),st.getCity()));
	}
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public QueryClass(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	public QueryClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int update(Student st) {
        String query="Update student Set name=?,city=? where id=?";
		
		return (this.jt.update(query,st.getName(),st.getCity(),st.getId()));
	
	}
	@Override
	public int delete(int id) {
          String query="Delete from student where id=?";
		
		return (this.jt.update(query,id));
		
	}
	@Override
	public Student getStudent(int id) {
//		Student st=new Student();
//		String query="Select * from student where id=?";
//	  SqlRowSet rowset= this.jt.queryForRowSet(query,id);
//	  while(rowset.next()) {
//		  st.setId(rowset.getInt(1));
//		  st.setName(rowset.getString(2));
//		  st.setCity(rowset.getString(3));
//	  }
	  
		Student st=new Student();
		String query="Select * from student where id=?";
		RowMapper<Student> rmp=new RowMapperImpl();
		 st=this.jt.queryForObject(query, rmp,id);
		return st;
	}
	@Override
	public List<Student> getAllStudents() {
		String query="Select * from student";
		List<Student> students=this.jt.query(query, new RowMapperImpl());
		return students;
	}

}
