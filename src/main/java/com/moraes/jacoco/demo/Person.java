package com.moraes.jacoco.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private Long id;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
