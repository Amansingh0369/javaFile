package Recursion.Array_Q;

import java.util.ArrayList;
import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 5, 6, 7, 8};
//        System.out.println(search(arr,5,0));
//        System.out.println(searchfromlast(arr,5, arr.length-1));
//        System.out.println(searchAllindex(arr,5,0));
//        System.out.println(list);
//        ArrayList list = searchAllindex2(arr, 5, 0, new ArrayList<>());
        System.out.println(searchAllindex3(arr, 5, 0));
    }

        static ArrayList<Integer> list1 = new ArrayList<>();
        static ArrayList searchAllindex ( int arr[], int target, int index){
            if (index == arr.length) {
                return list1;
            }
            if (arr[index] == target) {
                list1.add(index);
            }
            return searchAllindex(arr, target, index + 1);
        }
        //or
        static ArrayList<Integer> searchAllindex2 ( int[] ar, int target, int index, ArrayList<Integer > list){
            if (index == ar.length) {
                return list;
            }
            if (ar[index] == target) {
                list.add(index);
            }

            return searchAllindex2(ar, target, index + 1, list);
        }

        static int search ( int arr[], int target, int index){
            if (index == arr.length) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            } else {
                return search(arr, target, index + 1);
            }
        }

        static int searchfromlast ( int arr[], int target, int index){
            if (index == -1) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            } else {
                return searchfromlast(arr, target, index - 1);
            }
        }

        static ArrayList searchAllindex3 ( int arr[], int target, int index){
            ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchAllindex3(arr, target,index + 1) ;
            list.addAll(ansFromBelowCalls);
        return list;
  }
}
