package Backtracking;

import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
            int n  = 4;
            boolean[][] maze = new boolean[n][n];
            System.out.println( queens(maze,0));
    }
    public static int queens(boolean[][] maze, int row){
        if(row == maze.length){
            display(maze);
            return 1;
        }
        int count = 0;
        for(int col = 0; col < maze.length ; col++ ){
            if(issafe(maze,row,col)){
                maze[row][col] = true;
                count+= queens(maze,row+1);
                maze[row][col]=false;
            }
        }
        return count;
    }

    static boolean issafe(boolean[][] maze,int row, int col){
        for(int i = 0;i<row; i++){
            if(maze[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1;i <= maxLeft ; i++){
            if(maze[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,maze.length-col-1);
        for(int i = 1;i<=maxRight; i++){
            if(maze[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] maze) {
        for (boolean[] row : maze) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    }
