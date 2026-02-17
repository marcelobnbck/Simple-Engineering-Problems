package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;

public class DPK05_impl_04 {
    private static final Map<String, Integer> power = Map.of(
            "John", 100, "Paul", 90, "George", 80, "Ringo", 70
    );

    private static Map<String, Integer> leaderboard = new HashMap<>(Map.of(
            "John", 0, "Paul", 0, "George", 0, "Ringo", 0
    ));

    private static final Map<Integer, Map<String, Integer>> SCORING_RULES = Map.of(
            1,  Map.of("winner", 10, "loser", -5),  // P1 Wins
            -1, Map.of("winner", 10, "loser", -5),  // P2 Wins
            0,  Map.of("winner", 5,  "loser", 5)    // Draw
    );

    public static int getPower(String name) {
        return power.getOrDefault(name, 0);
    }

    public static int comparePower(String n1, String n2) {
        // Integer.compare returns 1, 0, or -1. No 'if' needed!
        return Integer.compare(getPower(n1), getPower(n2));
    }

    public static void play(String n1, String n2) {
        int result = comparePower(n1, n2);

        int p1Points = (result >= 0) ? SCORING_RULES.get(result).get("winner") : SCORING_RULES.get(-result).get("loser");
        int p2Points = (result <= 0) ? SCORING_RULES.get(-result).get("winner") : SCORING_RULES.get(result).get("loser");

        leaderboard.merge(n1, p1Points, Integer::sum);
        leaderboard.merge(n2, p2Points, Integer::sum);
    }

    public static void main(String[] args) {
        play("John", "Paul");
        play("John", "Ringo");
        System.out.println(leaderboard);
    }
}
