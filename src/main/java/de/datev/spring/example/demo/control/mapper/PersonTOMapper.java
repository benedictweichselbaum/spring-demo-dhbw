package de.datev.spring.example.demo.control.mapper;

import de.datev.spring.example.demo.boundary.dto.PersonTO;
import de.datev.spring.example.demo.entity.model.Person;

public class PersonTOMapper {

    private static final String SPACE = " ";

    public static PersonTO map (Person person) {
        return PersonTO.builder()
                .name(person.getName() + SPACE + person.getNachname())
                .wohnort(person.getWohnort())
                .build();
    }
}
