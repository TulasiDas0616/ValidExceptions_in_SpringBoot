package com.ssd.blog.Exception;

public class DescriptionException extends RuntimeException{
	private String description;
	private String expMsg;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExpMsg() {
		return expMsg;
	}
	public void setExpMsg(String expMsg) {
		this.expMsg = expMsg;
	}
	public DescriptionException(String description, String expMsg) {
		super();
		this.description = description;
		this.expMsg = expMsg;
	}
	public DescriptionException() {
		super();
	}
	
	
}
