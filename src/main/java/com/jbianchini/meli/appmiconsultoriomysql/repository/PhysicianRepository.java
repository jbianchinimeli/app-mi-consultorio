package com.jbianchini.meli.appmiconsultoriomysql.repository;

import com.jbianchini.meli.appmiconsultoriomysql.model.Physician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Long> {


}
