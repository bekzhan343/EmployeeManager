package com.example.employeemanagment.advice;

import com.example.employeemanagment.exception.DataAlreadyExistsException;
import com.example.employeemanagment.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class EmployeeControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<String> handlerNotFoundException(NotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }


    @ExceptionHandler(DataAlreadyExistsException.class)
    @ResponseBody
    public ResponseEntity<String> handlerDataAlreadyExistsException(DataAlreadyExistsException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}
