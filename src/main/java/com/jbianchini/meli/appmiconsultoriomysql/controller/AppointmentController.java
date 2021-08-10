package com.jbianchini.meli.appmiconsultoriomysql.controller;

import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentRequestDTO;
import com.jbianchini.meli.appmiconsultoriomysql.dto.AppointmentResponseDTO;
import com.jbianchini.meli.appmiconsultoriomysql.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class AppointmentController {

    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    /** Creates an appointment for a patient and a physician with certain schedule
     * @param appointment
     * @return
     */
    @PostMapping("/appointment")
    public ResponseEntity<AppointmentResponseDTO> createAppointment(
            @RequestBody @Valid AppointmentRequestDTO appointment) {
        return new ResponseEntity<>(appointmentService.scheduleAppointment(appointment), HttpStatus.OK);
    }

}
