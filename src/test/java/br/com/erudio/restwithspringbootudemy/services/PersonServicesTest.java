package br.com.erudio.restwithspringbootudemy.services;

import br.com.erudio.restwithspringbootudemy.RestWithSpringbootUdemyApplication;
import br.com.erudio.restwithspringbootudemy.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

//@SpringBootTest(webEnvironment = RANDOM_PORT, classes = {RestWithSpringbootUdemyApplication.class})
//Se tiver muitos atributos, talvez seja melhor usarmos a anotação acima e aí usar Autowired e não é preciso usar o initMocks
class PersonServicesTest {

    @InjectMocks
    private PersonServices personServices;

    private Person person1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        makeAnPerson();
    }

    @Test
    void whenFindAnIdThenReturnAnPerson() {
        var person = personServices.findById("1");
        assertEquals(person.getFirstName(), person1.getFirstName());
    }

    void makeAnPerson(){
        person1 = new Person(1L, "Juliano", "Silva", "Marcílio Noronha, Viana, ES, BR", "male");
    }

}