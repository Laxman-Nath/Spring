package com.spring.queries;

import java.util.List;

import com.spring.entities.Student;

public interface QueryInterface {
public int insert(Student st);
public int update(Student st);
public int delete(int  id);
public Student getStudent(int id);
public List<Student> getAllStudents();
}
