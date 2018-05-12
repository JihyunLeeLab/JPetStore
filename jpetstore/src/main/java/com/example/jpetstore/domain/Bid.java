package com.example.jpetstore.domain;

public class Bid {
	private String bid_id;
	private String auction_id;
	private String bidder_id;
	private String bid_date;
	public String getBid_id() {
		return bid_id;
	}
	public void setBid_id(String bid_id) {
		this.bid_id = bid_id;
	}
	public String getAuction_id() {
		return auction_id;
	}
	public void setAuction_id(String auction_id) {
		this.auction_id = auction_id;
	}
	public String getBidder_id() {
		return bidder_id;
	}
	public void setBidder_id(String bidder_id) {
		this.bidder_id = bidder_id;
	}
	public String getBid_date() {
		return bid_date;
	}
	public void setBid_date(String bid_date) {
		this.bid_date = bid_date;
	}
	public Bid(String bid_id, String auction_id, String bidder_id, String bid_date) {
		super();
		this.bid_id = bid_id;
		this.auction_id = auction_id;
		this.bidder_id = bidder_id;
		this.bid_date = bid_date;
	}
	
}
