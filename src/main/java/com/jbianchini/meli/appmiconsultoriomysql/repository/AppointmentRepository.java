package com.jbianchini.meli.appmiconsultoriomysql.repository;

import com.jbianchini.meli.appmiconsultoriomysql.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
