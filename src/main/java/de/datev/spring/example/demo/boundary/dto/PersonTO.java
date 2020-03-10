package de.datev.spring.example.demo.boundary.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonTO {

    String name;
    String wohnort;
}
