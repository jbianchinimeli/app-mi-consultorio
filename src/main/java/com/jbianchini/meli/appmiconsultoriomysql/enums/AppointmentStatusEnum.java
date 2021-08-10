package com.jbianchini.meli.appmiconsultoriomysql.enums;

import lombok.Getter;

@Getter
public enum AppointmentStatusEnum {
    finished("FN", "Finished"), cancelled("CN", "Cancelled"), pending("PN", "Pending"),
    rescheduled("RS", "Rescheduled");

    private String code;
    private String description;

    AppointmentStatusEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
