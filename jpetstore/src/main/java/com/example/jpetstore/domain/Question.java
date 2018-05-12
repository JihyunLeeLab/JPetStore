package com.example.jpetstore.domain;

public class Question {
	private String question_id;
	private String item_id;
	private String user_id;
	private String title;
	private String content;
	private String date;
	public String getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Question(String question_id, String item_id, String user_id, String title, String content, String date) {
		super();
		this.question_id = question_id;
		this.item_id = item_id;
		this.user_id = user_id;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
}
