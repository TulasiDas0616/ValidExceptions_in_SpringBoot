package com.ssd.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ssd.blog.entity.Post;
import com.ssd.blog.payload.PostDto;
import com.ssd.blog.serviceimpl.PostServiceImpl;
import com.ssd.blog.serviceimpl.ValidatationPassingByBindingResult;

@RestController
@RequestMapping("/api/v1")
public class PostRestController {
	
	@Autowired
	public PostServiceImpl postServiceImpl;
	@Autowired
	ValidatationPassingByBindingResult validatationPassingByBindingResult;
	
	@PostMapping("/posts")
	public ResponseEntity<?> sendPost(@Validated  @RequestBody PostDto postDto, BindingResult errorresults){
		if(errorresults.hasErrors()) {
			return validatationPassingByBindingResult.getBindingResultsErrors(errorresults);
		}
		else {
		return new ResponseEntity<PostDto> ( postServiceImpl.sendPost(postDto),HttpStatus.CREATED);
	}
		
	}
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPosts(){
		return new ResponseEntity<List<PostDto>> ( postServiceImpl.getAllPosts(),HttpStatus.OK);
		
	}
	@DeleteMapping("/posts/{id}")
	public void DeleteAuthorData(@PathVariable Long id) {
		postServiceImpl.deleteAuthorById(id);
	
    }
	
	
}
