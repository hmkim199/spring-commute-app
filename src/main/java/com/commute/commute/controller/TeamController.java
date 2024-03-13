package com.commute.commute.controller;

import com.commute.commute.dto.CreateTeamRequest;
import com.commute.commute.dto.SelectTeamsResponse;
import com.commute.commute.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/teams")
    public void createTeam(@RequestBody CreateTeamRequest createTeamRequest) {
        teamService.createTeam(createTeamRequest);
    }

    @GetMapping("/teams")
    public List<SelectTeamsResponse> selectTeams() {
        return teamService.selectTeams()
                .stream()
                .map(SelectTeamsResponse::new)
                .collect(Collectors.toList());
    }
}
