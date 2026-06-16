package org.example.problems.DPK14;

import java.util.ArrayList;
import java.util.List;

public class DPK14_impl_05 {
    public static List<String> fighterWalkIf(String[][] grid, int row, int column, List<String> moves) {
        List<String> beaten = new ArrayList<>();
        String fighter = grid[row][column];

        for (String move : moves) {
            int newRow = row;
            int newColumn = column;

            if (move.equals("up")) {
                if (row == 0) {
                    newRow = grid.length - 1;
                } else {
                    newRow = row - 1;
                }
            } else if (move.equals("down")) {
                if (row == grid.length - 1) {
                    newRow = 0;
                } else {
                    newRow = row + 1;
                }
            } else if (move.equals("left")) {
                if (column == 0) {
                    newColumn = grid[0].length - 1;
                } else {
                    newColumn = column - 1;
                }
            } else if (move.equals("right")) {
                if (column == grid[0].length - 1) {
                    newColumn = 0;
                } else {
                    newColumn = column + 1;
                }
            }

            if (!grid[newRow][newColumn].equals("")) {
                beaten.add(grid[newRow][newColumn]);
            }

            grid[row][column] = "";
            grid[newRow][newColumn] = fighter;

            row = newRow;
            column = newColumn;
        }
        return beaten;
    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        String[] moves = {"up", "left", "down", "right"};
        List<String> beaten = fighterWalkIf(grid, 0, 0, List.of(moves));
        System.out.println(beaten);
    }
}
