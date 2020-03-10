package de.datev.spring.example.demo.control;

import de.datev.spring.example.demo.boundary.dto.PersonTO;
import de.datev.spring.example.demo.control.mapper.PersonTOMapper;
import de.datev.spring.example.demo.entity.model.Person;
import de.datev.spring.example.demo.entity.repo.MyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PersonService {

    private final MyRepo myRepo;

    public PersonTO getPersonToById (Integer id) {
        Person person = myRepo.findById(id.longValue());
        return PersonTOMapper.map(person);
    }
}
