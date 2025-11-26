package com.example.employeemanagment.Constraints;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApiLogMessage {

    EMPLOYEE_MESSAGE_BY_ID("log{RECEIVING INFO ABOUT EMPLOYEE BY ID -> {}}"),
    NAME_OF_CURRENT_METHOD("log{CURRENT METHOD -> {}}");
    private final String value;

}
