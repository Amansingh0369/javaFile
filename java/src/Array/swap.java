package Array;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("enter array: ");
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];

        for(int i =0; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the index you want to swap: ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(arr,a,b);


            System.out.print(Arrays.toString(arr));

    }

    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]= a[index2];
        a[index2] = temp;
    }
}
