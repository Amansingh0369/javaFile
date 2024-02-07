package sorting.selection_sort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};
        for(int i =0; i < arr.length; i++){

            int last_index = arr.length-i-1;
            int max_index = maxIndex(arr,0,last_index);
            swap(arr,max_index,last_index);

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }


}
