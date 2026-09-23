package Opgave4;

public class Main {

    public static void main() {
        Team redTeam = new Team("Red Team");
        Team blueTeam = new Team("Blue Team");

        redTeam.addPlayer(new Player("Anna", 85));
        redTeam.addPlayer(new Player("Peter", 72));
        redTeam.addPlayer(new Player("Maria", 90));
        System.out.println();


        blueTeam.addPlayer(new Player("Lars", 78));
        blueTeam.addPlayer(new Player("Emma", 82));
        blueTeam.addPlayer(new Player("Simon", 88));
        blueTeam.addPlayer(new Player("Sofia", 75));
        System.out.println();

        redTeam.printTeam();
        blueTeam.printTeam();

        redTeam.compete(blueTeam);

        redTeam.findBestPlayer();

        blueTeam.findBestPlayer();

    }
}
