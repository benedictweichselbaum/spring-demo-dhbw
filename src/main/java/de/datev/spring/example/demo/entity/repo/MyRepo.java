package de.datev.spring.example.demo.entity.repo;

import de.datev.spring.example.demo.entity.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyRepo extends CrudRepository<Person, Integer> {

     // Methods need no implementation. Spring does that for them.
     Person findById (Long id);
}
