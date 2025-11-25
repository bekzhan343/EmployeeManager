package com.example.employeemanagment.service.impl;

import com.example.employeemanagment.Constraints.ApiNotFoundMessage;
import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.entity.Employee;
import com.example.employeemanagment.exception.NotFoundException;
import com.example.employeemanagment.repository.EmployeeRepository;
import com.example.employeemanagment.response.IamResponse;
import com.example.employeemanagment.service.EmployeeService;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository repository;

    public IamResponse<EmployeeDTO> getById(
            @NonNull Integer id
    ){
        Employee employee = repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException(ApiNotFoundMessage.NOT_FOUND_INFO.getMessage(id)));

        EmployeeDTO dto = EmployeeDTO
                .builder()
                .id(employee.getId())
                .name(employee.getName())
                .experience(employee.getExperience())
                .build();

        return IamResponse.createdSuccessfully(dto);
    }
}
