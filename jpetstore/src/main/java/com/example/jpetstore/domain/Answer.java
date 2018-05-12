package com.example.jpetstore.domain;

public class Answer {
	private String answer_id;
	private String question_id;
	private String content;
	private String date;
	public String getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(String answer_id) {
		this.answer_id = answer_id;
	}
	public String getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
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
	public Answer(String answer_id, String question_id, String content, String date) {
		super();
		this.answer_id = answer_id;
		this.question_id = question_id;
		this.content = content;
		this.date = date;
	}
	
}
