package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_03 {
    public static String[] fighterWalk(String[][] grid, int row, int column, String[] moves) {
        String fighter = grid[row][column];
        String[] beaten = new String[20];
        int beatenCount = 0;

        for (int i = 0; i < moves.length; i++) {
            int newRow = row;
            int newColumn = column;

            if (moves[i].equals("up")) {
                newRow--;
                if (newRow < 0) {
                    newRow = grid.length - 1;
                }
            }
            else if (moves[i].equals("down")) {
                newRow++;
                if (newRow >= grid.length) {
                    newRow = 0;
                }
            }
            else if (moves[i].equals("left")) {
                newColumn--;
                if (newColumn < 0) {
                    newColumn = grid[0].length - 1;
                }
            }
            else if (moves[i].equals("right")) {
                newColumn++;
                if (newColumn >= grid[0].length) {
                    newColumn = 0;
                }
            }
            if (!grid[newRow][newColumn].equals("")) {
                beaten[beatenCount] = grid[newRow][newColumn];
                beatenCount++;
            }

            grid[row][column] = "";
            grid[newRow][newColumn] = fighter;

            row = newRow;
            column = newColumn;
        }
        String[] result = new String[beatenCount];

        for (int i = 0; i < beatenCount; i++) {
            result[i] = beaten[i];
        }
        return result;
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
