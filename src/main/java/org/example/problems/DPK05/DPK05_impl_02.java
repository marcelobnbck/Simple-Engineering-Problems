package org.example.problems.DPK05;

import java.util.HashMap;
import java.util.Map;

public class DPK05_impl_02 {

    private static Map<String, Integer> power = new HashMap<>() {{
        put("John", 100);
        put("Paul", 90);
        put("George", 80);
        put("Ringo", 70);
    }};

    public static void main(String[] args) {
        System.out.println("Winner: " + play("John", "Paul"));
        System.out.println("Leaderboard: " + leaderboard);
        System.out.println("Winner: " + play("John", "Ringo"));
        System.out.println("Leaderboard: " + leaderboard);
    }
}
