package com.example.employeemanagment.dto;

import com.example.employeemanagment.entity.Employee;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Data
@Getter
@Setter
public class EmployeeDTO implements Serializable {
    private Integer id;
    private String name;
    private String experience;
}
