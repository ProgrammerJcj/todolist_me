package com.iljo.tdl.todoDto;

import java.sql.Timestamp;

public class ToDoDto {
	// field
	int td_id;
	String td_content;
	Timestamp td_date;
	int td_prior;
	int td_status;
	int category_ct_id;
	String user_user_id;
	
	
	public ToDoDto() {
		// TODO Auto-generated constructor stub
	}


	public ToDoDto(int td_id, String td_content, Timestamp td_date, int td_prior, int td_status, int category_ct_id,
			String user_user_id) {
		super();
		this.td_id = td_id;
		this.td_content = td_content;
		this.td_date = td_date;
		this.td_prior = td_prior;
		this.td_status = td_status;
		this.category_ct_id = category_ct_id;
		this.user_user_id = user_user_id;
	}


	public int getTd_id() {
		return td_id;
	}


	public void setTd_id(int td_id) {
		this.td_id = td_id;
	}


	public String getTd_content() {
		return td_content;
	}


	public void setTd_content(String td_content) {
		this.td_content = td_content;
	}


	public Timestamp getTd_date() {
		return td_date;
	}


	public void setTd_date(Timestamp td_date) {
		this.td_date = td_date;
	}


	public int getTd_prior() {
		return td_prior;
	}


	public void setTd_prior(int td_prior) {
		this.td_prior = td_prior;
	}


	public int getTd_status() {
		return td_status;
	}


	public void setTd_status(int td_status) {
		this.td_status = td_status;
	}


	public int getCategory_ct_id() {
		return category_ct_id;
	}


	public void setCategory_ct_id(int category_ct_id) {
		this.category_ct_id = category_ct_id;
	}


	public String getUser_user_id() {
		return user_user_id;
	}


	public void setUser_user_id(String user_user_id) {
		this.user_user_id = user_user_id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}