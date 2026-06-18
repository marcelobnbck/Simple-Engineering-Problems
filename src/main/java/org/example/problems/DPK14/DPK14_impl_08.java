package org.example.problems.DPK14;

import java.util.List;

public class DPK14_impl_08 {
    public static String[] fighterWalk(String[][] grid, int row, int column, int[] moves) {
        String fighter = grid[row][column];
        String[] beaten = new String[20];
        int count = 0;

        for(int i = 0; i < moves.length; i++){
            if(moves[i] == 0){
                row--;
            }
            if(moves[i] == 1){
                row++;
            }
            if(moves[i] == 2){
                column--;
            }
            if(moves[i] == 3){
                column++;
            }
            if(row < 0){
                row = grid.length - 1;
            }
            if(row >= grid.length){
                row = 0;
            }
            if(column < 0){
                column = grid[0].length - 1;
            }
            if(column >= grid[0].length){
                column = 0;
            }
            if(grid[row][column] != ""){
                beaten[count] = grid[row][column];
                count++;
            }
            grid[row][column] = fighter;
        }
        return beaten;
    }

    public static void main(String[] args) {
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        int[] moves = {0,2,1,3};
        //String[] directions = {"up", "left", "down", "right"};
        List<String> beaten = List.of(fighterWalk(grid, 0, 0, moves));
        System.out.println(beaten);
    }
}
