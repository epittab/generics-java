package com.Generics.GenClass;

import java.util.ArrayList;

public class Team {
    
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();


    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.print(player.getName() + " is already on the team.");
            return false;
        } else {
            members.add(player);
            System.out.print(player.getName() + " added to the team " + this.name + ".\n" );
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore ) {
            lost++;
        } else {
            tied++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

}
