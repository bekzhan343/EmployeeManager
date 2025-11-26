package com.example.employeemanagment.dto;

import com.example.employeemanagment.entity.Employee;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
    private Integer id;
    private String name;
    private String experience;
}
