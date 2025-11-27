package com.example.employeemanagment.exception;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DataAlreadyExistsException extends RuntimeException {
    public DataAlreadyExistsException(String message) {
        super(message);
    }
}
