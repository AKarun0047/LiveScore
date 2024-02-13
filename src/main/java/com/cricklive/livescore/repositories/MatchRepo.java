package com.cricklive.livescore.repositories;

import com.cricklive.livescore.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    // match fetching

    Optional<Match> findByTeamHeading(String teamHeading);
}
