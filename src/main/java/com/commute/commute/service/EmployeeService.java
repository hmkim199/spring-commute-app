package com.commute.commute.service;

import com.commute.commute.dto.CreateEmployeeRequest;
import com.commute.commute.dto.SelectEmployeeResponse;
import com.commute.commute.entity.Employee;
import com.commute.commute.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        employeeRepository.save(new Employee(createEmployeeRequest));
    }

    public List<Employee> selectEmployee() {
        return employeeRepository.findAll();
    }

}
