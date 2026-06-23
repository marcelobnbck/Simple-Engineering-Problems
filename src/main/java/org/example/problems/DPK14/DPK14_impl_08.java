package org.example.problems.DPK14;

import java.util.Arrays;

public class DPK14_impl_08 {
        public static String[] fighterWalk(String[][] grid, int startRow, int startColumn, String[] moves) {
            int row = startRow;
            int column = startColumn;
            int beatenIndex = 0;
            String fighter = grid[row][column];
            String[] beaten = new String[20];

            for (int i = 0; i < moves.length; i++) {
                int newRow = row;
                int newColumn = column;

                if (moves[i] == "up") {
                    newRow = row - 1;
                    if (newRow < 0) {
                        newRow = grid.length - 1;
                    }
                }
                if (moves[i] == "down") {
                    newRow = row + 1;
                    if (newRow >= grid.length) {
                        newRow = 0;
                    }
                }
                if (moves[i] == "left") {
                    newColumn = column - 1;
                    if (newColumn < 0) {
                        newColumn = grid[0].length - 1;
                    }
                }
                if (moves[i] == "right") {
                    newColumn = column + 1;
                    if (newColumn >= grid[0].length) {
                        newColumn = 0;
                    }
                }

                if (grid[newRow][newColumn] != "") {
                    beaten[beatenIndex] = grid[newRow][newColumn];
                    beatenIndex++;
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
        String[] beaten = fighterWalk(grid, 0, 0, moves);
        System.out.println(Arrays.toString(beaten));
    }
}
