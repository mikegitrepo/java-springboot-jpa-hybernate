package com.example.mukesh.jpa.hybernate.jpahybernate.repositorry;

import javax.persistence.EntityManager;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Passport;
import com.example.mukesh.jpa.hybernate.jpahybernate.entity.Student;
@Repository
@Transactional
public class StudentRepository {
	@Autowired
	EntityManager em;
	public Student findById(Long id){
		return em.find(Student.class, id );
	}
	public Student save( Student student){
		if( student.getId() == null ){
			em.persist(student);
			
		}else{
			em.merge(student);
		}
		return student;
	}
	public void deleteById(Long id){
		Student student = findById(id);
		em.remove(student);
	}
	public void saveStudentWithPassport(){
		Passport passport = new Passport("W778766");
		em.persist(passport);
		Student student = new Student("Mike");
		student.setPassport(passport);
		em.persist(student);
	}
	public Passport findGivenPassport(){
		return em.find(Passport.class, 40001l);
	}
}
