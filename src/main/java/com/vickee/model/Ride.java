package com.vickee.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "ride_tbl")
public class Ride {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rideid;
	private String ridetype;
	private String ridename;
	private String starttime;
	private String endtime;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] rideimage;
	
	public Ride() {
		super();
	}

	public Ride(long rideid, String ridetype, String ridename, String starttime, String endtime, byte[] rideimage) {
		super();
		this.rideid = rideid;
		this.ridetype = ridetype;
		this.ridename = ridename;
		this.starttime = starttime;
		this.endtime = endtime;
		this.rideimage = rideimage;
	}

	public long getRideid() {
		return rideid;
	}

	public void setRideid(long rideid) {
		this.rideid = rideid;
	}

	public String getRidetype() {
		return ridetype;
	}

	public void setRidetype(String ridetype) {
		this.ridetype = ridetype;
	}

	public String getRidename() {
		return ridename;
	}

	public void setRidename(String ridename) {
		this.ridename = ridename;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public byte[] getRideimage() {
		return rideimage;
	}

	public void setRideimage(byte[] rideimage) {
		this.rideimage = rideimage;
	}


}
