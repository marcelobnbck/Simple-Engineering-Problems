package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_04 {
    public static String[] fighterWalk(String[][] grid, int row, int column, int[] moves, List<String> directions) {
        String fighter = grid[row][column];

        String[] beaten = new String[20];
        int count = 0;

        for (String move : directions) {
            switch (move) {
                case "up":
                    move = String.valueOf(1);
                    break;
                case "down":
                    move = String.valueOf(2);
                    break;
                case "left":
                    move = String.valueOf(3);
                    break;
                case "right":
                    move = String.valueOf(4);
                    break;
            }
        }

        for (int i = 0; i < moves.length; i++) {
            int newRow = row;
            int newCol = column;

            if (moves[i] == 1) {
                newRow--;
                if (newRow < 0) {
                    newRow = grid.length - 1;
                }
            } else if (moves[i] == 2) {
                newRow++;
                if (newRow >= grid.length) {
                    newRow = 0;
                }
            } else if (moves[i] == 3) {
                newCol--;
                if (newCol < 0) {
                    newCol = grid[0].length - 1;
                }
            } else if (moves[i] == 4) {
                newCol++;
                if (newCol >= grid[0].length) {
                    newCol = 0;
                }
            }

            if (!grid[newRow][newCol].equals("")) {
                beaten[count] = grid[newRow][newCol];
                count++;
            }

            grid[row][column] = "";
            grid[newRow][newCol] = fighter;

            row = newRow;
            column = newCol;
        }

        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            result[i] = beaten[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        int[] moves = {1,3,2,4};
        String[] directions = {"up", "left", "down", "right"};
        List<String> beaten = List.of(fighterWalk(grid,0,0, moves, List.of(directions)));
        System.out.println(beaten);
    }
}
