package com.mbit.lms.model;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "JOURNAL_ID")
	private Journal journal;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Journal getJournal() {
		return journal;
	}
	
	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	
}
