package br.com.erudio.restwithspringbootudemy.controller;

import br.com.erudio.restwithspringbootudemy.exception.UnsupportedMathOperationException;
import br.com.erudio.restwithspringbootudemy.model.Person;
import br.com.erudio.restwithspringbootudemy.services.PersonServices;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonServices service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }

}
