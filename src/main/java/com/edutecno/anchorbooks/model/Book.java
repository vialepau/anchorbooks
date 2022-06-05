package com.edutecno.anchorbooks.model;

//import lombok.Data;


public class Book {

	

	private Integer id;
	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String title;
	
	public Integer getId() {
		return id;
	}



	public String getAuthor() {
		return author;
	}



	public String getCountry() {
		return country;
	}



	public String getImageLink() {
		return imageLink;
	}



	public String getLanguage() {
		return language;
	}



	public String getTitle() {
		return title;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "Book [id= " + id + ", author= " + author + ", country= " + country + ", imageLink= " + imageLink
				+ ", language= " + language + ", title= " + title + "]";
	}
	
	
	
}
