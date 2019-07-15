package com.test.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Entity @Table(name = "persons")
public class PersonEntity extends BaseDate {

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;
}
