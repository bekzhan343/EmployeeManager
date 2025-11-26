package com.example.employeemanagment.mapping;

import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.entity.Employee;
import org.hibernate.type.descriptor.DateTimeUtils;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class EmployeeMapping {

    public EmployeeDTO toDTO(Employee employee){
        return EmployeeDTO.builder()
                .id(employee.getId())
                .name(employee.getName())
                .experience(employee.getExperience())
                .build();
    }
}
