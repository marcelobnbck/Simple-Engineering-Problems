package org.example.problems.DPK14;

import java.util.ArrayList;
import java.util.List;

public class DPK14_impl_02 {
    public static List<String> fighterWalkIf(String[][] grid, int row, int column, List<String> moves) {
        List<String> beaten = new ArrayList<>();

        String fighter = grid[row][column];

        for (String move : moves) {

            int newRow = row;
            int newColumn = column;

            if (move == "up") {
                newRow = (row - 1 + grid.length) % grid.length;
            } else if (move == "down") {
                newRow = (row + 1) % grid.length;
            } else if (move == "left") {
                newColumn = (column - 1 + grid[0].length) % grid[0].length;
            } else if (move == "right") {
                newColumn = (column + 1) % grid[0].length;
            }

            if (grid[newRow][newColumn] != "") {
                beaten.add(grid[newRow][newColumn]);
            }

            grid[newRow][newColumn] = "";
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
