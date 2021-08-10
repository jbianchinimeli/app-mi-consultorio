package com.jbianchini.meli.appmiconsultoriomysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "appointment_status")
@Getter
@Setter
public class AppointmentStatus {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;
}
