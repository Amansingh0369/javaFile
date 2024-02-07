package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,3,5,8,5};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }

        int max = array[0];
        for(int num : array) {
            if(num > max) {
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for(int num : array) {
            countArray[num]++;
        }

        int index = 0;
        for(int i=0; i<= max; i++) {
            while(countArray[i] > 0) {
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }

    }
}
