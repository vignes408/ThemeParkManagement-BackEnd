package com.vickee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attract_table")
public class Attraction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long attid;
	private String email;
	private String description;
	public Attraction() {
		super();
	}
	public Attraction(long attid, String email, String description) {
		super();
		this.attid = attid;
		this.email = email;
		this.description = description;
	}
	public long getAttid() {
		return attid;
	}
	public void setAttid(long attid) {
		this.attid = attid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
