package com.mbit.lms.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "JOURNAL")
public class Journal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "journal", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Task> tasks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
