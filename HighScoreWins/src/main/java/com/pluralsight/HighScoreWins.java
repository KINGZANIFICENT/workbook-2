package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine();

        // 1) Split into [teamPart, scorePart] around the pipe character
        String[] parts = input.split("\\|");
        String teamPart = parts[0];   // e.g. "Home:Visitor"
        String scorePart = parts[1];   // e.g. "21:9"

        // 2) Split the team names around the colon
        String[] teams = teamPart.split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        // 3) Split the scores around the colon and convert to integers
        String[] scores = scorePart.split(":");
        int homeScore    = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // 4) Compare and pick the winner
        String winner;
        if (homeScore > visitorScore) {
            winner = homeTeam;
        } else if (visitorScore > homeScore) {
            winner = visitorTeam;
        } else {
            winner = "It's a tie!";
        }

        System.out.println("Winner: " + winner);
    }
}
