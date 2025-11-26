package com.example.employeemanagment.mapping;

import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.entity.Employee;
import org.springframework.stereotype.Component;


@Component
public class EmployeeMapping {

    public Employee toEmployee(EmployeeDTO dto){
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setName(dto.getName());
        employee.setExperience(dto.getExperience());

        return employee;
    }
}
