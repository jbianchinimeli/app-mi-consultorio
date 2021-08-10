package com.jbianchini.meli.appmiconsultoriomysql.service;

import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentRequestDTO;
import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentResponseDTO;

public interface AppointmentService {
    public AppointmentResponseDTO scheduleAppointment(AppointmentRequestDTO appointmentRequest);
}
