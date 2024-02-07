package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers in array: ");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
            sum = arr[i] + sum;
        }

        System.out.println("Enterd  array is : ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i] +" ");

        }
        System.out.print(Arrays.toString(arr));
        System.out.println( " sum is: "+ sum);


    }
}
