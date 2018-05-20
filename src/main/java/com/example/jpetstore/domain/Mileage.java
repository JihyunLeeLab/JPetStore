package com.example.jpetstore.domain;

import java.sql.Date;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Mileage {
	
	private String user_id;
	private Date date;
	private int point;
	private int transfer;
	private String description;
	
	
	public Mileage() {
	}
	
	public Mileage(String user_id, Date date, int point, int transfer, String description) {
		this.user_id = user_id;
		this.date = date;
		this.point = point;
		this.transfer = transfer;
		this.description = description;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int isTransfer() {
		return transfer;
	}
	public void setTransfer(int transfer) {
		this.transfer = transfer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
