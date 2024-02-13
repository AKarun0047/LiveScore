package com.cricklive.livescore.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Crickt_match")
public class Match {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int matchID;

    private String teamHeading;

    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bolTeamScore;
    private String livetext;

    private String Matchlink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date= new Date();


    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }
}


