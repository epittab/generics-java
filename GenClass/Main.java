package com.Generics.GenClass;

public class Main {

    public static void main(String[] args) {
        // comments
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team crows = new Team("Crows");

        crows.addPlayer(joe);
        crows.addPlayer(pat);
        crows.addPlayer(beckham);

        System.out.println(crows.numPlayers());

    }
    
}
