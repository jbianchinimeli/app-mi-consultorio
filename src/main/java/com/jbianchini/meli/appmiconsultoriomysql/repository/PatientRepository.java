package com.jbianchini.meli.appmiconsultoriomysql.repository;

import com.jbianchini.meli.appmiconsultoriomysql.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
