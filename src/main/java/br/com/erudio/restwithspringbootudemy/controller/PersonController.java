package br.com.erudio.restwithspringbootudemy.controller;

import br.com.erudio.restwithspringbootudemy.exception.UnsupportedMathOperationException;
import br.com.erudio.restwithspringbootudemy.model.Person;
import br.com.erudio.restwithspringbootudemy.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person request){
        return service.create(request);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person request){
        return service.create(request);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") String id){
        service.delete(id);
    }

}
