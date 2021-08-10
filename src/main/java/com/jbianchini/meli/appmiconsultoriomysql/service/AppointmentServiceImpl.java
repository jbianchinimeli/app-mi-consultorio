package com.jbianchini.meli.appmiconsultoriomysql.service;

import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentRequestDTO;
import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentResponseDTO;
import com.jbianchini.meli.appmiconsultoriomysql.model.Appointment;
import com.jbianchini.meli.appmiconsultoriomysql.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    AppointmentRepository repository;

    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public AppointmentResponseDTO scheduleAppointment(AppointmentRequestDTO appointmentRequest) {
        Appointment appointment = new Appointment();

        this.repository.save(appointment);

        return this.mapResponse(appointment);
    }

    private AppointmentResponseDTO mapResponse(Appointment appointment) {
        return new AppointmentResponseDTO();
    }
}
