package com.commute.commute.dto;

import com.commute.commute.entity.Employee;
import com.commute.commute.entity.Team;

import java.time.LocalDate;

public class SelectEmployeeResponse {
    private String name;
    private String role;
    private LocalDate joinDate;
    private LocalDate birthDay;

    public SelectEmployeeResponse(Employee employee) {
        this.name = employee.getName();
        this.role = employee.getRole();
        this.joinDate = employee.getJoinDate();
        this.birthDay = employee.getBirthday();
    }
}
