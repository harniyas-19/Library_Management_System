package com.wipro.book.bean;

public class AuthorBean {
	private int authorCode;
	private String authorName;
	private long contactNo;
	public int getAuthorCode() {
		return authorCode;
	}
	public String getAuthorName() {
		return authorName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setAuthorCode(int authorCode) {
		this.authorCode = authorCode;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
}
