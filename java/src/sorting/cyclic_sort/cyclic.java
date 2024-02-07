package sorting.cyclic_sort;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,5};
        int i = 0;
        while(i<arr.length){
            int correct_index = arr[i] -1;      //vale = arr[i]
            if(arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
