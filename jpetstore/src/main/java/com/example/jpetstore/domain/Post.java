package com.example.jpetstore.domain;

public class Post {
	private String post_id;
	private String user_id;
	private String supp_id;
	private String title;
	private String date;
	private int star_rating;
	private String image;
	private String content;
	private int view_count;
	private int like_count;
	
	
	public Post(String post_id, String user_id, String supp_id, String title, String date, int star_rating,
			String image, String content, int view_count, int like_count) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.supp_id = supp_id;
		this.title = title;
		this.date = date;
		this.star_rating = star_rating;
		this.image = image;
		this.content = content;
		this.view_count = view_count;
		this.like_count = like_count;
	}
	
	
	public String getPost_id() {
		return post_id;
	}
	
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getSupp_id() {
		return supp_id;
	}
	public void setSupp_id(String supp_id) {
		this.supp_id = supp_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStar_rating() {
		return star_rating;
	}
	public void setStar_rating(int star_rating) {
		this.star_rating = star_rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}
}
