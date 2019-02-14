package com.example.mukesh.jpa.hybernate.jpahybernate.repositorry;

import java.util.List;

import javax.persistence.EntityManager;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Course;
import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Review;
@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager em;
	public Course findById(Long id){
		return em.find(Course.class, id );
	}
	public Course save( Course course){
		if( course.getId() == null ){
			em.persist(course);
			
		}else{
			em.merge(course);
		}
		return course;
	}
	public void deleteById(Long id){
		Course course = findById(id);
		em.remove(course);
	}
	public void addReviewsToCourse(){
		Course course = findById(10003l);
		Review review1 = new Review("5","awesome in couse");
		Review review2 = new Review("5","awesome in couse2");
		course.addReview(review1);
		course.addReview(review2);
		review1.setCourse(course);
		review2.setCourse(course);
		em.persist(review1);
		em.persist(review2);
	}
	public void addReviewsToCourseList(Long courseId, List<Review> reviews){
		Course course = findById(courseId);
		for(Review review:reviews){
			course.addReview(review);
			review.setCourse(course);
			em.persist(review);
		}
	}
	
}
