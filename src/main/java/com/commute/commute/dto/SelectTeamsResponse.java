package com.commute.commute.dto;

import com.commute.commute.entity.Team;

public class SelectTeamsResponse {
    private String name;

    private String manager;

    private int memberCount;

    public SelectTeamsResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager().getName();
        //TODO: 팀 멤버 수 조회  this.memberCount = team
    }
}
