package Array.twod;

import java.util.Arrays;
import java.util.Scanner;

public class string_array {
    public static void main(String[] args) {
        System.out.println("enter the 4 names of ur friend");
        Scanner in = new Scanner(System.in);
        String[][] strarr = new String[2][2];

        for(int row = 0 ; row < strarr.length;row++){
            for(int col =0; col < strarr.length;col++) {
                strarr[row][col] = in.next();
            }
        }


        for(int i=0;i<2;i++){
            System.out.println(Arrays.toString(strarr[i]));
        }


//enhacnde for loop
//        for(String[] a: strarr){
//            System.out.println(Arrays.toString(a));
//        }
    }
}
