package de.datev.spring.example.demo.entity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "person")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Long id;

    private String name;

    private String nachname;

    private String wohnort;
}
