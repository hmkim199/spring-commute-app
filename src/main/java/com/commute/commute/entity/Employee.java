package com.commute.commute.entity;

import com.commute.commute.dto.CreateEmployeeRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String role;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate joinDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Team team;

    public Employee(CreateEmployeeRequest createEmployeeRequest) {
        this.name = createEmployeeRequest.getName();
        this.role = createEmployeeRequest.getRole();
        this.birthday = createEmployeeRequest.getBirthday();
        this.joinDate = createEmployeeRequest.getJoinDate();
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
