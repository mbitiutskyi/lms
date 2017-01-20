package com.mbit.lms.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    //TODO add a list of days (enum?)
    private Trainer trainer;
    @ManyToMany(mappedBy="courses")
    private List<Student> students;
    
    

}
