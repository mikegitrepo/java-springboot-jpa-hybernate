package com.example.easynotes.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Person;
@Repository
public interface PersonRepository  extends JpaRepository<Person, Long> {

}
