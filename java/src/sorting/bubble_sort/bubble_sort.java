package sorting.bubble_sort;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        for(int i =0; i<arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]) {
                    swap(arr, j - 1, j);
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int a,int b ){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]= temp;
    }
}
