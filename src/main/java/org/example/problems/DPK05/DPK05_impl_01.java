package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;

public class DPK05_impl_01 {
    // Initializing our HashMaps
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

    public static String getWinner(String name1, String name2) {
        int power1 = getPower(name1);
        int power2 = getPower(name2);

        if (power1 > power2) {
            return name1;
        } else if (power2 > power1) {
            return name2;
        } else {
            return "Draw";
        }
    }

    public static String play(String name1, String name2) {
        String winner = getWinner(name1, name2);

        if (winner.equals("Draw")) {
            leaderboard.put(name1, leaderboard.get(name1) + 5);
            leaderboard.put(name2, leaderboard.get(name2) + 5);
        } else if (winner.equals(name1)) {
            leaderboard.put(name1, leaderboard.get(name1) + 10);
            leaderboard.put(name2, leaderboard.get(name2) - 5);
        } else {
            leaderboard.put(name2, leaderboard.get(name2) + 10);
            leaderboard.put(name1, leaderboard.get(name1) - 5);
        }

        return winner;
    }

    public static void main(String[] args) {
        System.out.println("Winner: " + play("John", "Paul"));
        System.out.println("Leaderboard: " + leaderboard);
        System.out.println("Winner: " + play("John", "Ringo"));
        System.out.println("Leaderboard: " + leaderboard);
    }
}
