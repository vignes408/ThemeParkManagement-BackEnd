package com.vickee.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_tbl")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookid;
	private Date selectdate;
	private String tickettype;
	private int adultcount;
	private int childrencount;
	private String name;
	private String email;
	private long phonenumber;
	private long pincode;
	private double amount;
	private String regid;
	
	public Booking() {
		super();
	}
	
	@ManyToOne
	@JoinColumn(name = "reg_id")
	Register register;
	


	public Booking(long bookid, Date selectdate, String tickettype, int adultcount, int childrencount, String name,
			String email, long phonenumber, long pincode, double amount, String regid, Register register) {
		super();
		this.bookid = bookid;
		this.selectdate = selectdate;
		this.tickettype = tickettype;
		this.adultcount = adultcount;
		this.childrencount = childrencount;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.pincode = pincode;
		this.amount = amount;
		this.regid = regid;
		this.register = register;
	}







	public long getBookid() {
		return bookid;
	}







	public void setBookid(long bookid) {
		this.bookid = bookid;
	}







	public Date getSelectdate() {
		return selectdate;
	}







	public void setSelectdate(Date selectdate) {
		this.selectdate = selectdate;
	}







	public String getTickettype() {
		return tickettype;
	}







	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}







	public int getAdultcount() {
		return adultcount;
	}







	public void setAdultcount(int adultcount) {
		this.adultcount = adultcount;
	}







	public int getChildrencount() {
		return childrencount;
	}







	public void setChildrencount(int childrencount) {
		this.childrencount = childrencount;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public long getPhonenumber() {
		return phonenumber;
	}







	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}







	public long getPincode() {
		return pincode;
	}







	public void setPincode(long pincode) {
		this.pincode = pincode;
	}







	public double getAmount() {
		return amount;
	}







	public void setAmount(double amount) {
		this.amount = amount;
	}







	public String getRegid() {
		return regid;
	}







	public void setRegid(String regid) {
		this.regid = regid;
	}







	public Register getRegister() {
		return register;
	}







	public void setRegister(Register register) {
		this.register = register;
	}



	
	
	
}
