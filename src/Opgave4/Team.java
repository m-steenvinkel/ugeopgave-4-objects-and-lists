package Opgave4;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
        System.out.println(p.getName() + " has been added to " + this.teamName);
    }

    public double getAverageSkill() {
        int sum = 0;
        for (Player player : players) {
            sum += player.getSkillLevel();
        }
        double average = (double) sum / players.size();
        return average;
    }

    public void printTeam() {
        System.out.println(this.teamName + " players:");
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println();
    }

    public void compete(Team opponent) {
        if (this.getAverageSkill() > opponent.getAverageSkill()) {
            System.out.println(this.teamName + " wins!\n");
        } else {
            System.out.println(opponent.teamName + " wins!\n");
        }
    }

    public void findBestPlayer() {
        Player bestPlayer = players.getFirst();
        for (Player player : players) {
            if (player.getSkillLevel() > bestPlayer.getSkillLevel()) {
                bestPlayer = player;
            }
        }
        System.out.println("The best player in " + this.teamName + " is: " + bestPlayer + "\n");
    }


}
