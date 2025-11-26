package com.example.employeemanagment.mapping;

import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.entity.Employee;

import org.springframework.stereotype.Component;


@Component
public class EmployeeDTOMapping {

    public EmployeeDTO toDTO(Employee employee){
        return EmployeeDTO.builder()
                .id(employee.getId())
                .name(employee.getName())
                .experience(employee.getExperience())
                .build();
    }
}
