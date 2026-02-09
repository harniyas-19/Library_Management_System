package com.wipro.book.bean;

public class BookBean {
	private String isbn;
	private String bookName;
	private AuthorBean author;
	private char bookType;
	private float cost;
	public String getIsbn() {
		return isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public AuthorBean getAuthor() {
		return author;
	}
	public char getBookType() {
		return bookType;
	}
	public float getCost() {
		return cost;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	public void setBookType(char bookType) {
		this.bookType = bookType;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
