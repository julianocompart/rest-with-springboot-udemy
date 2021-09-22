package br.com.erudio.restwithspringbootudemy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Person implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

}
