package com.commute.commute.repository;

import com.commute.commute.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
//    public List<Team> findAllByName(String name);
}
