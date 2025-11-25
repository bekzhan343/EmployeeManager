package com.example.employeemanagment.response;

import com.example.employeemanagment.entity.Employee;

import java.io.Serializable;

public record IamResponse<P extends Serializable>(
        String message,
        P payload,
        boolean success
) implements Serializable{
    public static <P extends Serializable> IamResponse<P> createdSuccessfully(P payload){
        return new IamResponse<>("DONE SUCCESSFULLY!",payload, true);
    }
}