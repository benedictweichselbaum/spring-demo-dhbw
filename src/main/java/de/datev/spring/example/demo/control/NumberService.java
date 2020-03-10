package de.datev.spring.example.demo.control;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public Long doubleNumber (Long number) {
        return number*2;
    }
}
