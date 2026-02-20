package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;

public class DPK05_impl_06 {
    private static Map<String, Integer> power = new HashMap<>() {{
        put("John", 100);
        put("Paul", 90);
        put("George", 80);
        put("Ringo", 70);
    }};

    private static Map<String, Integer> leaderboard = new HashMap<>() {{
        put("John", 0);
        put("Paul", 0);
        put("George", 0);
        put("Ringo", 0);
    }};

    public static int getPower(String name) {
        return power.getOrDefault(name, 0);
    }

    public static String getWinner(String n1, String n2) {
        int p1 = getPower(n1);
        int p2 = getPower(n2);
        return (p1 == p2) ? "Draw" : (p1 > p2 ? n1 : n2);
    }

    public static String play(String n1, String n2) {
        String winner = getWinner(n1, n2);
        leaderboard.put(n1, leaderboard.get(n1)
                + (winner.equals("Draw") ? 5
                : (winner.equals(n1) ? 10 : -5)));
        leaderboard.put(n2, leaderboard.get(n2)
                + (winner.equals("Draw") ? 5
                : (winner.equals(n2) ? 10 : -5)));
        return winner;
    }

    public static void main(String[] args) {
        System.out.println("Match 1 Winner: " + play("John", "Paul"));
        System.out.println("Match 2 Winner: " + play("John", "Ringo"));
        System.out.println("Final Leaderboard: " + leaderboard);
    }
}
