package com.jbianchini.meli.appmiconsultoriomysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "schedule")
@Getter
@Setter
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "time_from")
    private LocalTime from;

    @Column(name = "time_to")
    private LocalTime to;

    @ManyToMany(mappedBy = "schedules")
    private List<Physician> physician;

    @OneToMany(mappedBy = "schedule")
    private List<Appointment> appointments;
}
