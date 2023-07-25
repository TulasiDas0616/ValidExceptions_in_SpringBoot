package com.ssd.blog.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
@Service
public class ValidatationPassingByBindingResult {

	public ResponseEntity<Map<String, String>> getBindingResultsErrors(BindingResult errorresults){
		Map<String, String> errorMap=new HashMap<>();
		for (FieldError fielderror :errorresults.getFieldErrors()) {
			
		
			errorMap.put(fielderror.getField(), fielderror.getDefaultMessage());
		}
		
		
		return new ResponseEntity<Map<String,String>>(errorMap, HttpStatus.BAD_REQUEST);
		
	}
}
