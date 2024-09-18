package com.vickee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintain")
public class Maintainence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mainid;
	private String task;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "ride_Id")
	private Ride ride;
	
	public Maintainence() {
		super();
	}

	public Maintainence(long mainid, String task, String description, Ride ride) {
		super();
		this.mainid = mainid;
		this.task = task;
		this.description = description;
		this.ride = ride;
	}

	public long getMainid() {
		return mainid;
	}

	public void setMainid(long mainid) {
		this.mainid = mainid;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}
	
	

	
	
	
}
