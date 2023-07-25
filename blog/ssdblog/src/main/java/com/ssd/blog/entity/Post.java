package com.ssd.blog.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String title;
	@Column(unique = true)
	private String description;
	private String content;
	private Date postDate;
	
	
	
	
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content
				+ ", postDate=" + postDate + "]";
	}




	public Post() {
		super();
	}




	public Post(Long id, String title, String description, String content, Date postDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public Date getPostDate() {
		return postDate;
	}




	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}




	public Post(String title, String description, String content, Date postDate) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}
	
	

}
