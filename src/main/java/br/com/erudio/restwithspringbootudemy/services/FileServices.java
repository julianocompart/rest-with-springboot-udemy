package br.com.erudio.restwithspringbootudemy.services;

import br.com.erudio.restwithspringbootudemy.model.Person;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class FileServices {

    public List<Person> readPersonsFromCsv() throws FileNotFoundException {
        var pathFile = "src/main/resources/persons.csv";

        var file = new FileReader(pathFile);

        //Faz o bind dos dados do csv para uma lista de beans da classe especificada, se eu quisesse ler bean por bean
        //aí usaria o CsvToBean();
        List<Person> persons = new CsvToBeanBuilder<Person>(file)
            .withType(Person.class)
            .build()
            .parse();

        return persons;
    }

}
