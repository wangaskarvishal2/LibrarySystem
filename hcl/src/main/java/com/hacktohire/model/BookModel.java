package com.hacktohire.model;

public class BookModel {
	
	private int uuid,rackNo;
	private String title,author,category,
	edition,Status;
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public int getRack() {
		return rackNo;
	}
	public void setRack(int rack) {
		this.rackNo = rack;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	

}
