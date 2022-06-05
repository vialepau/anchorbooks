package com.edutecno.anchorbooks.model;


public class BookDetail extends Book{

	private Integer id;
	private String author;
	private String country;
	private String imageLink;
	
	private String language;
	
	private String link;
	private Integer pages;
	private String title;	
	private Integer year;
	private Integer price;
	private Integer lastPrice;
	private Boolean delivery;
	
	

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



	public String getLink() {
		return link;
	}



	public Integer getPages() {
		return pages;
	}



	public Integer getYear() {
		return year;
	}



	public Integer getPrice() {
		return price;
	}



	public Integer getLastPrice() {
		return lastPrice;
	}



	public Boolean getDelivery() {
		return delivery;
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



	public void setLink(String link) {
		this.link = link;
	}



	public void setPages(Integer pages) {
		this.pages = pages;
	}



	public void setYear(Integer year) {
		this.year = year;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public void setLastPrice(Integer lastPrice) {
		this.lastPrice = lastPrice;
	}



	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}



	@Override
	public String toString() {
		return "BookDetail [id= " + id + ", author= " + author + ", country= " + country + ", imageLink= " + imageLink
				+ ", language= " + language + ", title= " + title + ", link= " + link + ", pages= " + pages + ", year= "
				+ year + ", price= " + price + ", lastPrice= " + lastPrice + ", delivery= " + delivery + "]";
	}



	
	
	
	

	
}
