package Array;

import java.util.Scanner;

public class max_in_array {
    public static void main(String[] args) {
        System.out.println("Enter array: ");
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(max(arr));

    }

    static int max(int arr[]){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >max) {
                 max = arr[i];
            }

        }

        return max;
    }
}
