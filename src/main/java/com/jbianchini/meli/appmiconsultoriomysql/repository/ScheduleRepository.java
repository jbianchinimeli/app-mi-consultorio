package com.jbianchini.meli.appmiconsultoriomysql.repository;

import com.jbianchini.meli.appmiconsultoriomysql.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
