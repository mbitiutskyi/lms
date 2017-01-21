package com.mbit.lms.dao;

import java.util.List;
import com.mbit.lms.model.Student;

public interface StudentDao {

	List<Student> getStudents();

	Student getStudentById(int id);
	
	void addStudent(Student student);

	void updateStudent(Student student);

	void removeStudent(Student student);

}
