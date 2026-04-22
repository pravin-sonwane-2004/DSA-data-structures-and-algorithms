// Q4. Problem:
// Create a POJO class Player with fields: playerId, name, runs, and matches.
// Store details of 5 players using an array of objects. 
 
// Perform the following operations:
// Calculate the average runs per match for each player.
// Find and display the player with the highest batting average.
// Print the details of players whose batting average is above the team average.


class QNo4 {

    public static void main(String[] args) {

        Player[] p = new Player[5];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Player();
        }

        p[0].setPlayerId(1);
        p[0].setName("Pravin");
        p[0].setRuns(2222);
        p[0].setMatches(34);

        p[1].setPlayerId(101);
        p[1].setName("Virat Kohli");
        p[1].setRuns(27975);
        p[1].setMatches(556);

        p[2].setPlayerId(104);
        p[2].setName("Babar Azam");
        p[2].setRuns(15363);
        p[2].setMatches(341);

        p[3].setPlayerId(14);
        p[3].setName("Azam");
        p[3].setRuns(1563);
        p[3].setMatches(34);

        p[4].setPlayerId(18);
        p[4].setName("Rohit Sharma");
        p[4].setRuns(19000);
        p[4].setMatches(450);

        // 1️⃣ Calculate average for each player
        double totalAverage = 0;
        double highestAverage = 0;
        Player highestPlayer = null;

        for (int i = 0; i < p.length; i++) {

            double avg = (double) p[i].getRuns() / p[i].getMatches();
            System.out.println(p[i].getName() + " Batting Average: " + avg);

            totalAverage += avg;

            if (avg > highestAverage) {
                highestAverage = avg;
                highestPlayer = p[i];
            }
        }

        // 2️⃣ Player with highest batting average
        System.out.println("\nPlayer with Highest Average:");
        System.out.println(highestPlayer.getName() + " -> " + highestAverage);

        // 3️⃣ Team average
        double teamAverage = totalAverage / p.length;
        System.out.println("\nTeam Average: " + teamAverage);

        // 4️⃣ Players above team average
        System.out.println("\nPlayers Above Team Average:");

        for (int i = 0; i < p.length; i++) {
            double avg = (double) p[i].getRuns() / p[i].getMatches();
            if (avg > teamAverage) {
                System.out.println(p[i].getName() + " -> " + avg);
            }
        }
    }
}
class Player {
	
	private int playerId;
    private String name;
    private int runs;
    private int matches;

    // Getter and Setter for playerId
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for runs
    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    // Getter and Setter for matches
    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }
}
