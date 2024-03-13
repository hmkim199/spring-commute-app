package com.commute.commute.entity;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Employee manager;

    public Team(String name) {
        this.name = name;
    }

    public Team() {

    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }
}
