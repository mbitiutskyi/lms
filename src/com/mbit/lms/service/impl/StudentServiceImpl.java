package com.mbit.lms.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.mbit.lms.dao.StudentDao;
import com.mbit.lms.model.Student;
import com.mbit.lms.service.StudentService;

@Stateless
public class StudentServiceImpl implements StudentService {

	@EJB
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}
	
	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	public void removeStudent(Student student) {
		studentDao.removeStudent(student);		
	}


}
