package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class DPK05_impl_09 {
    private static final Map<String, Integer> power = Map.of(
            "John", 100,
            "Paul", 90,
            "George", 80,
            "Ringo", 70
    );

    private static final Map<String, Integer> leaderboard = new HashMap<>(Map.of(
            "John", 0,
            "Paul", 0,
            "George", 0,
            "Ringo", 0
    ));

    public static int getPower(String name) {
        return power.getOrDefault(name, 0);
    }

    public static String getWinner(String name1, String name2) {
        int diff = getPower(name1) - getPower(name2);

        return diff == 0
                ? "Draw"
                : (diff > 0 ? name1 : name2);
    }

    public static String play(String name1, String name2) {
        String winner = getWinner(name1, name2);
        BiConsumer<String, Integer> updateScore =
                (name, delta) -> leaderboard.merge(name, delta, Integer::sum);
        int p1 = getPower(name1);
        int p2 = getPower(name2);
        int diff = Integer.compare(p1, p2);
        updateScore.accept(name1, diff > 0 ? 10 : diff < 0 ? -5 : 5);
        updateScore.accept(name2, diff < 0 ? 10 : diff > 0 ? -5 : 5);
        return winner;
    }

    public static void main(String[] args) {
        System.out.println("Match 1 Winner: " + play("John", "Paul"));
        System.out.println("Match 2 Winner: " + play("John", "Ringo"));
        System.out.println("Final Leaderboard: " + leaderboard);
    }
}
