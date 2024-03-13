package com.commute.commute.controller;

import com.commute.commute.dto.CreateEmployeeRequest;
import com.commute.commute.dto.SelectEmployeeResponse;
import com.commute.commute.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public void createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        employeeService.createEmployee(createEmployeeRequest);
    }

    @GetMapping("/employee")
    public List<SelectEmployeeResponse> selectEmployee() {

        return employeeService.selectEmployee()
                .stream().map(SelectEmployeeResponse::new)
                .collect(Collectors.toList());
    }
}
