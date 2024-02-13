package com.cricklive.livescore.services;

import com.cricklive.livescore.entities.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

    //get all matches

    List<Match> getAllMatches();
    // get live matches
 List<Match> getLiveMatches();

}
