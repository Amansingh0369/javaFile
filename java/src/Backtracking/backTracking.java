package Backtracking;

import java.util.ArrayList;

public class backTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,false},
                {true,true,true},
                {false,true,true},
        };
        ArrayList<String> list = new ArrayList<>();
        AllPath("",maze,0,0,list);
        System.out.println(list);
    }

    static void AllPath(String p,boolean[][] maze, int r, int c, ArrayList<String> list){
        if( r == maze.length-1 && c == maze[0].length -1 ){
            list.add(p);
            return ;
        }
        if(!maze[r][c]){
            return ;
        }
        // I am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length - 1 ){
            AllPath( p + 'D', maze, r+1 , c,list);
        }
        if(c < maze[0].length - 1){
            AllPath( p + 'R', maze, r , c +1,list);
        }
        if(r > 0){
            AllPath(p + 'U', maze, r-1 , c,list);
        }
        if(c > 0){
            AllPath(p + 'L', maze, r , c-1 ,list);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
}
