package com.vickee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_tbl")
public class Events {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eventid;
	private String eventname;
	private String description;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] eventimage;
	
	
	public Events() {
		super();
	}

	public Events(long eventid, String eventname, String description, byte[] eventimage) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.description = description;
		this.eventimage = eventimage;
	}

	public long getEventid() {
		return eventid;
	}

	public void setEventid(long eventid) {
		this.eventid = eventid;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getEventimage() {
		return eventimage;
	}

	public void setEventimage(byte[] eventimage) {
		this.eventimage = eventimage;
	}
	
	
	
	
}
