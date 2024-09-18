package com.vickee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "role_tbl")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleid;
	private String personname;
	private String gender;
	private String rolename;
	private String description;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] roleimage;
	
	
	public Role() {
		super();
	}


	public Role(long roleid, String personname, String gender, String rolename, String description, byte[] roleimage) {
		super();
		this.roleid = roleid;
		this.personname = personname;
		this.gender = gender;
		this.rolename = rolename;
		this.description = description;
		this.roleimage = roleimage;
	}


	public long getRoleid() {
		return roleid;
	}


	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}


	public String getPersonname() {
		return personname;
	}


	public void setPersonname(String personname) {
		this.personname = personname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public byte[] getRoleimage() {
		return roleimage;
	}


	public void setRoleimage(byte[] roleimage) {
		this.roleimage = roleimage;
	}
	
	
	
}
