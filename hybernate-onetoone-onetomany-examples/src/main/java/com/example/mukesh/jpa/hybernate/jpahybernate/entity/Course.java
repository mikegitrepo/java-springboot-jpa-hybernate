package com.example.mukesh.jpa.hybernate.jpahybernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	public Long id;
	public String name;
	@OneToMany( mappedBy="course")
	private List<Review> reviews = new ArrayList<Review>();
	protected Course(){}
	
	public Course( String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Review> getReviews(){
		return reviews;
	}
	public void addReview(Review review){
		this.reviews.add(review);
	}
	public void removeReview( Review review){
		this.reviews.remove(review);
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
}
