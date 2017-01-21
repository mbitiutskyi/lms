package com.mbit.lms.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mbit.lms.model.Student;
import com.mbit.lms.service.StudentService;

@ManagedBean
@RequestScoped
public class StudentController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private List<Student> students;

	private String firstName;
	private String lastName;
	private int age;

	@EJB
	private StudentService service;

	@PostConstruct
	private void init() {
		students = service.getStudents();
	}

	public String addStudent() {
		Student student = new Student(firstName, lastName, age);
		System.out.println(student);
		service.addStudent(student);
		students.add(student);
		return null;
	}
	
	public void removeStudent(Student student) {
		service.removeStudent(student);
		students.remove(student);
	}

	public void editStudent(Student student) {
		// TODO
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
