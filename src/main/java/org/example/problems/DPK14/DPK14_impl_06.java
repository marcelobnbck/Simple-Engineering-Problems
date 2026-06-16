package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_06 {
    public static String[] fighterWalk(String[][] grid, int row, int column, String[] moves) {
        String fighter = grid[row][column];
        String[] beaten = new String[20];
        int count = 0;

        for (int i = 0; i < moves.length; i++) {
            int rowMove = 0;
            int columnMove = 0;

            if (moves[i] == "up") {
                rowMove = -1;
            }
            if (moves[i] == "down") {
                rowMove = 1;
            }
            if (moves[i] == "left") {
                columnMove = -1;
            }
            if (moves[i] == "right") {
                columnMove = 1;
            }

            int newRow = row + rowMove;
            int newColumn = column + columnMove;

            if (newRow < 0) {
                newRow = grid.length - 1;
            }
            if (newRow >= grid.length) {
                newRow = 0;
            }
            if (newColumn < 0) {
                newColumn = grid[0].length - 1;
            }
            if (newColumn >= grid[0].length) {
                newColumn = 0;
            }

            if (grid[newRow][newColumn] != "") {
                beaten[count] = grid[newRow][newColumn];
                count++;
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
        List<String> beaten = List.of(fighterWalk(grid, 0, 0, moves));
        System.out.println(beaten);
    }
}
