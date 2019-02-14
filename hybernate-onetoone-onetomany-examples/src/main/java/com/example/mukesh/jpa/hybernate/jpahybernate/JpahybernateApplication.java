package com.example.mukesh.jpa.hybernate.jpahybernate;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Course;
import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Passport;
import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Review;
import com.example.mukesh.jpa.hybernate.jpahybernate.repositorry.CourseRepository;
import com.example.mukesh.jpa.hybernate.jpahybernate.repositorry.StudentRepository;

@SpringBootApplication
public class JpahybernateApplication implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpahybernateApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		//Course course = repository.findById(10001L);
		//logger.info("Course 1000 -> {}", course);
		//repository.save(new Course("some new course"));
		//studentRepository.saveStudentWithPassport();
		//findGivenPassport
		//logger.info("student 1000 -> {}", studentRepository.findById(20002l));
		//Passport passport = studentRepository.findGivenPassport();
		//logger.info("passport data 1000 -> {}", passport);
		//logger.info("student id :  -> {}", passport.getStudent());
		//this.courseRepository.addReviewsToCourse();
		Review review1 = new Review("3","awesome in couseList");
		Review review2 = new Review("3","awesome in couse2LIst");
		List<Review> reviews = new ArrayList<Review>();
		reviews.add(review1);
		reviews.add(review2);
		this.courseRepository.addReviewsToCourseList(10003l, reviews);
		
		
	}

}

