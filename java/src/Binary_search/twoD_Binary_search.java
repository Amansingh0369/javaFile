package Binary_search;

import java.util.Arrays;

public class twoD_Binary_search {
    public static void main(String[] args){
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {18,26,37,48},
                {19,29,39,50}
        };
        int target = 37;

        System.out.println(Arrays.toString(twoDsearch(arr,target)));
    }
    public static int[] twoDsearch(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[] {row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
