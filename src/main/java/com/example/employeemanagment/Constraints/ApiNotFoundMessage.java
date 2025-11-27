package com.example.employeemanagment.Constraints;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ApiNotFoundMessage {
    NOT_FOUND_INFO("INFO NOT FOUND BY ID->%s!"),
    ALREADY_EXISTS_INFO("DATA ALREADY EXISTS BY NAME: %s" );
    private final String message;

    public String getMessage(Object... args) {
        return String.format(message,args);
    }
}
