package com.mbit.lms.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	@ManyToMany
	@JoinTable(name="STUDENT_COURSE",
    		joinColumns = @JoinColumn(name="STUDENT_ID", referencedColumnName="id"),
    		inverseJoinColumns = @JoinColumn(name="COURSE_ID", referencedColumnName="id"))
	private List<Course> courses;
	@Transient
	private boolean isEditable;
	
	public Student(){
	}
	
	public Student(String firstName, String lastName, int age, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public boolean isEditable() {
		return isEditable;
	}
	public void setEditable(boolean isEditable) {
		this.isEditable = isEditable;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
