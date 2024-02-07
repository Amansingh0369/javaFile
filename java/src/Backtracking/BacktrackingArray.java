package Backtracking;

import java.util.Arrays;

public class BacktrackingArray {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true},
        };
        int[][] path = new int[maze.length][maze[0].length];
        AllPath("", maze, 0,0,path,1);
    }
    static void AllPath(String p,boolean[][] maze, int r, int c, int path[][], int step){
        if( r == maze.length-1 && c == maze[0].length -1 ){
            path[r][c] = step;
            for(int i = 0; i < path.length ; i++){
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[r][c]){
            return ;
        }
        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1 ){
            AllPath( p + 'D', maze, r+1 , c, path, step+1);
        }
        if(c < maze[0].length - 1){
            AllPath( p + 'R', maze, r , c +1, path,step+1 );
        }
        if(r > 0){
            AllPath(p + 'U', maze, r-1 , c, path, step+1);
        }
        if(c > 0){
            AllPath(p + 'L', maze, r , c-1 , path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
