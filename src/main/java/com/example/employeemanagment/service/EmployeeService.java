package com.example.employeemanagment.service;


import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.response.IamResponse;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;


public interface EmployeeService {
    IamResponse<EmployeeDTO> getById(@NonNull Integer id);

    IamResponse<EmployeeDTO> createEmployeeObj(@NotNull EmployeeDTO dto);
}
