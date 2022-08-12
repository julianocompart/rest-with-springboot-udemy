package br.com.erudio.restwithspringbootudemy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.opencsv.bean.CsvBindAndJoinByName;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @CsvBindByName
    private Long id;
    @CsvBindByName(column = "first_name")
    private String firstName;
    @CsvBindByName(column = "last_name")
    private String lastName;
    @CsvBindByName
    private String address;
    @CsvBindByName
    private String gender;

}
