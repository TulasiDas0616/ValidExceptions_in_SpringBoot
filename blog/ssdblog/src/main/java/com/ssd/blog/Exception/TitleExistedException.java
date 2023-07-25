package com.ssd.blog.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class TitleExistedException extends RuntimeException {
	
	private String title;
	private String expMsg;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExpMsg() {
		return expMsg;
	}
	public void setExpMsg(String expMsg) {
		this.expMsg = expMsg;
	}
	public TitleExistedException(String title, String expMsg) {
		super();
		this.title = title;
		this.expMsg = expMsg;
	}
	public TitleExistedException() {
		super();
	}
	
	

}
