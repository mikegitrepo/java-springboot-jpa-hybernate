package com.example.mukesh.jpa.hybernate.jpahybernate.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mukesh.jpa.hybernate.jpahybernate.JpahybernateApplication;
import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Course;
import com.example.mukesh.jpa.hybernate.jpahybernate.repositorry.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpahybernateApplication.class)
public class CourserRepositoryTest{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;
	@Test
	public void findById_Basic() {
		logger.info("Logger is rnning");
		Course course = repository.findById(10001l);
		assertEquals("jpa in 50 steps", course.getName());
		repository.save(new Course("some new course from test"));
	}
	@Test
	public void findById_save() {
		logger.info("Logger is rnning in save");
		
		assertEquals(repository.save(new Course("some new test1")).getName(), "some new test1");
		
	}

}
