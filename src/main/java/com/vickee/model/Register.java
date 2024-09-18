package com.vickee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long regid;
	private String username;
	@Column(unique = true)
	private String email;
	private long mobileno;
	private String password;
	private String repassword;

	
	public Register() {
		super();
	}


	public Register(long regid, String username, String email, long mobileno, String password, String repassword) {
		super();
		this.regid = regid;
		this.username = username;
		this.email = email;
		this.mobileno = mobileno;
		this.password = password;
		this.repassword = repassword;
	}


	public long getRegid() {
		return regid;
	}


	public void setRegid(long regid) {
		this.regid = regid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRepassword() {
		return repassword;
	}


	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	

	
	
	
}
