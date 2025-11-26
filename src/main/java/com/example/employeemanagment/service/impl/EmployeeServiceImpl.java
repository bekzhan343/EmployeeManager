package com.example.employeemanagment.service.impl;

import com.example.employeemanagment.Constraints.ApiNotFoundMessage;
import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.entity.Employee;
import com.example.employeemanagment.exception.NotFoundException;
import com.example.employeemanagment.mapping.EmployeeMapping;
import com.example.employeemanagment.repository.EmployeeRepository;
import com.example.employeemanagment.response.IamResponse;
import com.example.employeemanagment.service.EmployeeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository repository;
    private final EmployeeMapping mapping;

    public IamResponse<EmployeeDTO> getById(
            @NonNull Integer id
    ){
        Employee employee = repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException(ApiNotFoundMessage.NOT_FOUND_INFO.getMessage(id)));

        EmployeeDTO dto = mapping.toDTO(employee);

        return IamResponse.createdSuccessfully(dto);
    }
}
