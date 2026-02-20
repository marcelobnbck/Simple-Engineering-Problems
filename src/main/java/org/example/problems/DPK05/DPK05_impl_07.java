package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class DPK05_impl_07 {
    private static Map<String, Integer> power = Map.of(
            "John", 100,
            "Paul", 90,
            "George", 80,
            "Ringo", 70
    );

    private static Map<String, Integer> leaderboard = new HashMap<>(Map.of(
            "John", 0,
            "Paul", 0,
            "George", 0,
            "Ringo", 0
    ));

    public static int getPower(String name) {
        return power.getOrDefault(name, 0);
    }

    public static String getWinner(String n1, String n2) {
        int diff = getPower(n1) - getPower(n2);
        return (diff == 0) ? "Draw" : (diff > 0 ? n1 : n2);
    }

    public static String play(String n1, String n2) {
        String winner = getWinner(n1, n2);
        boolean isDraw = winner.equals("Draw");

        BiFunction<String, Integer, Integer> scoreCalc = (
                name,
                current) ->
                current + (isDraw ? 5 : (name.equals(winner) ? 10 : -5)
        );

        leaderboard.compute(n1, (k, v) -> scoreCalc.apply(k, v));
        leaderboard.compute(n2, (k, v) -> scoreCalc.apply(k, v));
        return winner;
    }

    public static void main(String[] args) {
        System.out.println("Match 1 Winner: " + play("John", "Paul"));
        System.out.println("Match 2 Winner: " + play("John", "Ringo"));
        System.out.println("Final Leaderboard: " + leaderboard);
    }
}
