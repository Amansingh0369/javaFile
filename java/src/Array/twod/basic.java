package Array.twod;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("ener array: ");
        Scanner in = new Scanner(System.in);
/*
[1,2,3],
[4,5,6],
[7,8,9]
 */
        int[][] arr = new int[3][3];
        for(int row =0; row< arr.length; row++){
            for(int col =0; col <arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        for(int row =0; row< arr.length; row++){
            for(int col =0; col <arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }


    }
}
