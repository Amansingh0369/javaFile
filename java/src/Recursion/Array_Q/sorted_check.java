package Recursion.Array_Q;

public class sorted_check {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4,5,6};
        System.out.println(sorted_check(arr,0));
    }

    static boolean sorted_check(int arr[], int index){
        if(index == arr.length - 1){
            return true;
        }

        return arr[index]<=arr[index+1] && sorted_check(arr,index+1);
    }
}
