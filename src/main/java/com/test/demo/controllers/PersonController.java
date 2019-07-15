package com.test.demo.controllers;

import com.test.demo.entities.PersonEntity;
import com.test.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("persons")
    public List<PersonEntity> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("persons/{id}")
    public PersonEntity getPersonById(@PathVariable("id") Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @PostMapping("persons")
    public PersonEntity saveNewPerson(@RequestBody PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }
}