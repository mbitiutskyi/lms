package com.mbit.lms.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mbit.lms.dao.StudentDao;
import com.mbit.lms.model.Student;

@Stateless
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext(name = "LmsApp")
	private EntityManager entityManager;

	@Override
	public List<Student> getStudents() {
		return entityManager.createQuery("from Student", Student.class).getResultList();
	}

	@Override
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}
	
	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		Student item = entityManager.find(Student.class, student.getId());
		entityManager.remove(item);
	}



}
