package Linear_search;

import java.util.Arrays;

public class seacrhIN2Darr {
    public static void main(String[] args) {
        int arr[][]={
                {5,3,2},
                {77,44,65,68},
                {56,34,23}
        };
        int target = 55;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int arr[][],int target){
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return  new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
