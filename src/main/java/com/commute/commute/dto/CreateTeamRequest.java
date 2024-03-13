package com.commute.commute.dto;

public class CreateTeamRequest {
    private String name;

    public CreateTeamRequest(String name) {
        this.name = name;
    }

    public CreateTeamRequest() {

    }

    public String getName() {
        return name;
    }
}
