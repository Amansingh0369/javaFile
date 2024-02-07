package Array.twod;

import java.util.Arrays;
import java.util.Scanner;

public class new_basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1,2,3
        4,5
        6,7,8,9
         */

        int[][] arr = new int[3][3];
        for(int row = 0;row< arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
        //new way to output array
//        for(int row = 0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//            System.out.println();
//        }
        //enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
            System.out.println();
        }
    }
}
