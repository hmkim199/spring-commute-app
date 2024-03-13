package com.commute.commute.dto;

import java.time.LocalDate;

public class CreateEmployeeRequest {
    private String name;
    private String role;
    private LocalDate birthday;
    private LocalDate joinDate;

    public CreateEmployeeRequest() {
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }
}
