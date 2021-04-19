package com.cg.entities;

import javax.persistence.Entity;

@Entity
public class FeedBack {
	private int rating;
	private String comment;
	private String username;
	private String routeName;
	private BusOperator busOperator;
	
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack(int rating, String comment, String username, String routeName, BusOperator busOperator) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.username = username;
		this.routeName = routeName;
		this.busOperator = busOperator;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public BusOperator getBusOperator() {
		return busOperator;
	}
	public void setBusOperator(BusOperator busOperator) {
		this.busOperator = busOperator;
	}
	@Override
	public String toString() {
		return "FeedBack [rating=" + rating + ", comment=" + comment + ", username=" + username + ", routeName="
				+ routeName + ", busOperator=" + busOperator + "]";
	} 
	
	
	
}
