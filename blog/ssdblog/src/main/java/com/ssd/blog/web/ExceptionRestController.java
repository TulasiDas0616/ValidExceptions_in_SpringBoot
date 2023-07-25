package com.ssd.blog.web;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssd.blog.Exception.DescriptionException;
import com.ssd.blog.Exception.ExceptionDetails;
import com.ssd.blog.Exception.TitleExistedException;

@ControllerAdvice
public class ExceptionRestController {
//	@ExceptionHandler(value = TitleExistedException.class)
//	public ResponseEntity<ExceptionDetails> exception(TitleExistedException exception) {
//		ExceptionDetails ed = new ExceptionDetails(new Date(),exception.getTitle(),exception.getExpMsg());
	@ExceptionHandler(value = DescriptionException.class)
	public ResponseEntity<ExceptionDetails> exception(DescriptionException exception) {
		ExceptionDetails ed = new ExceptionDetails(new Date(),exception.getDescription(),exception.getExpMsg());
	return new ResponseEntity<ExceptionDetails>(ed, HttpStatus.NOT_FOUND);
	}

}
