package org.example.problems.DPK14;

import java.util.ArrayList;
import java.util.List;

public class DPK14_impl_07 {
    public static List<String> fighterWalk(String[][] grid, int[] startPosition, String[] moves) {
        List<String> beaten = new ArrayList<>();
        int row = startPosition[0];
        int col = startPosition[1];
        String fighter = grid[row][col];

        for (String move : moves) {
            int newRow = row;
            int newCol = col;

            switch (move.toLowerCase()) {
                case "up":
                    newRow = (row - 1 + grid.length) % grid.length;
                    break;
                case "down":
                    newRow = (row + 1) % grid.length;
                    break;
                case "left":
                    newCol = (col - 1 + grid[0].length) % grid[0].length;
                    break;
                case "right":
                    newCol = (col + 1) % grid[0].length;
                    break;
            }
            if (!grid[newRow][newCol].isEmpty()) {
                beaten.add(grid[newRow][newCol]);
            }
            grid[row][col] = "";
            grid[newRow][newCol] = fighter;

            row = newRow;
            col = newCol;
        }
        return beaten;
    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        String[] moves = {"up", "left", "down", "right"};
        List<String> beaten = fighterWalk(grid, new int[]{0, 0}, moves);
        System.out.println(beaten);
    }
}
