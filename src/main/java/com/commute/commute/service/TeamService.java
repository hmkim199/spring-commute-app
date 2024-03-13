package com.commute.commute.service;

import com.commute.commute.dto.CreateTeamRequest;
import com.commute.commute.dto.SelectTeamsResponse;
import com.commute.commute.entity.Team;
import com.commute.commute.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void createTeam(CreateTeamRequest createTeamRequest) {
        teamRepository.save(new Team(createTeamRequest.getName()));
    }

    public List<Team> selectTeams() {
        return teamRepository.findAll();
    }
}
