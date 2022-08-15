package br.com.erudio.restwithspringbootudemy.services;

import br.com.erudio.restwithspringbootudemy.model.Person;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        return new Person(counter.incrementAndGet(), "Juliano", "Silva", "Marcílio Noronha, Viana, ES, BR", "male");
    }

    public Person create(Person person) {
        //entra aqui a logica que salva no banco de dados
        return person;
    }

    public Person update(Person person) {
        //entra aqui a logica que salva no banco de dados
        return person;
    }

    public void delete(String id){
        //logica para deletar, consultando o banco
    }

}
