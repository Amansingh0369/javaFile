package Array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("Enter the numbers in array: ");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enterd  array is : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
