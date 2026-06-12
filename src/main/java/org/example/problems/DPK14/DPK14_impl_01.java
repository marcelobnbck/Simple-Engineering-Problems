package org.example.problems.DPK14;

import java.util.ArrayList;
import java.util.List;

public class DPK14_impl_01 {
    public static List<String> fighterWalk(String[][] grid, int row, int column, List<String> moves) {
        List<String> beaten = new ArrayList<>();
        String fighter = grid[row][column];

        for (String move : moves) {
            int newRow = row;
            int newCol = column;

            switch (move) {
                case "up":
                    newRow = (row - 1 + grid.length) % grid.length;
                    break;
                case "down":
                    newRow = (row + 1) % grid.length;
                    break;
                case "left":
                    newCol = (column - 1 + grid[0].length) % grid[0].length;
                    break;
                case "right":
                    newCol = (column + 1) % grid[0].length;
                    break;
            }
            if (!grid[newRow][newCol].isEmpty()) {
                beaten.add(grid[newRow][newCol]);
            }
            grid[row][column] = "";
            grid[newRow][newCol] = fighter;

            row = newRow;
            column = newCol;
        }

        return beaten;
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
