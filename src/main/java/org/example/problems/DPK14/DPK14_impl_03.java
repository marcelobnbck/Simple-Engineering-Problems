package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_03 {
    public static List<String> fighterWalk(String[][] grid, int row, int column, List<String> moves) {
        List<String> beaten = new java.util.ArrayList<>();
        String fighter = grid[row][column];


    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        String[] moves = {"up", "left", "down", "right"};
        List<String> beaten = fighterWalk(grid, 0, 0, List.of(moves));
        System.out.println(beaten);
    }
}
