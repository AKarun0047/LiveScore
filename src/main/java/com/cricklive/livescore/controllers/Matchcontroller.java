package com.cricklive.livescore.controllers;


import com.cricklive.livescore.entities.Match;
import com.cricklive.livescore.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class Matchcontroller {
    private MatchService matchService;

    public Matchcontroller(MatchService matchService) {
        this.matchService = matchService;
    }



    //get live matches
    @GetMapping("/Live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
}
