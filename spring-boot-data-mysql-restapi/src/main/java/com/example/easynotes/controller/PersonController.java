package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import com.example.easynotes.model.Person;
import com.example.easynotes.repository.PersonRepository;

@RestController
@RequestMapping("/api")
public class PersonController {
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/person")
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @PostMapping("/person")
    public Person createPerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable(value = "id") int personId) {
        return personRepository.findById(personId);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable(value = "id") int personId,
                                           @Valid @RequestBody Person personDetails) {

        Person person = personRepository.findById(personId);

        person.setTitle(personDetails.getTitle());
        person.setContent(personDetails.getContent());

        Person updatedPerson = personRepository.save(person);
        return updatedPerson;
    }

}
