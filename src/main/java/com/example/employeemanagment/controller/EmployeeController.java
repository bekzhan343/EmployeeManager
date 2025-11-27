package com.example.employeemanagment.controller;


import com.example.employeemanagment.Constraints.ApiConstants;
import com.example.employeemanagment.Constraints.ApiLogMessage;
import com.example.employeemanagment.dto.EmployeeDTO;
import com.example.employeemanagment.response.IamResponse;
import com.example.employeemanagment.service.EmployeeService;
import com.example.employeemanagment.service.impl.EmployeeServiceImpl;
import com.example.employeemanagment.utils.ApiUtils;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("${end.point.employee}")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("${end.point.id}")
    public ResponseEntity<IamResponse<EmployeeDTO>> getById(@PathVariable("id") Integer id){
        IamResponse<EmployeeDTO> response = employeeService.getById(id);

        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(),ApiUtils.getMethodName());

        return ResponseEntity.ok(response);
    }

    @PostMapping("${end.point.create}")
    public ResponseEntity<IamResponse<EmployeeDTO>> create(@RequestBody EmployeeDTO employeeDTO){
        IamResponse<EmployeeDTO> response = employeeService.createEmployeeObj(employeeDTO);
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(),ApiUtils.getMethodName());

        return ResponseEntity.ok(response);
    }

}
