package de.datev.spring.example.demo.boundary;

import de.datev.spring.example.demo.boundary.dto.PersonTO;
import de.datev.spring.example.demo.control.PersonService;
import de.datev.spring.example.demo.entity.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PersonApi {

    private final PersonService personService;

    @GetMapping(value = "/person/{id}")
    public ResponseEntity<PersonTO> getPersonById(@PathVariable Integer id) {

        return ResponseEntity.ok().body(personService.getPersonToById(id));
    }
}
