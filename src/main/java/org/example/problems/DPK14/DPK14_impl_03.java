package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_03 {
    public static String[] fighterWalk(
            String[][] grid,
            int[] startPosition,
            String[] moves) {

        int row = startPosition[0];
        int col = startPosition[1];

        String fighter = grid[row][col];

        String[] beaten = new String[20];
        int beatenCount = 0;

        for (int i = 0; i < moves.length; i++) {

            int newRow = row;
            int newCol = col;

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
                newCol--;

                if (newCol < 0) {
                    newCol = grid[0].length - 1;
                }
            }
            else if (moves[i].equals("right")) {
                newCol++;

                if (newCol >= grid[0].length) {
                    newCol = 0;
                }
            }

            if (!grid[newRow][newCol].equals("")) {
                beaten[beatenCount] = grid[newRow][newCol];
                beatenCount++;
            }

            grid[row][col] = "";
            grid[newRow][newCol] = fighter;

            row = newRow;
            col = newCol;
        }

        String[] result = new String[beatenCount];

        for (int i = 0; i < beatenCount; i++) {
            result[i] = beaten[i];
        }

        return beaten;
    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        String[] moves = {"up", "left", "down", "right"};
        List<String> beaten = fighterWalk();
        System.out.println(beaten);
    }
}
