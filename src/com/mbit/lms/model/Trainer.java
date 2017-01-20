package com.mbit.lms.model;

import javax.persistence.*;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
}
