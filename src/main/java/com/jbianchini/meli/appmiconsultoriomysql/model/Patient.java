package com.jbianchini.meli.appmiconsultoriomysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patient")
@Getter
@Setter
public class Patient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
