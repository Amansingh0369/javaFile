package Recursion.Array_Q;

public class Rotated_sorted_binar_search {
    public static void main(String[] args){
        int arr[] = {5,6,7,8,1,2,3,4};
        int target = 2;
        System.out.println(Rbs(arr,target,0,arr.length-1));
    }
    static int Rbs(int arr[],int target,int s, int e){
        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return Rbs(arr,target,s,m-1);
            }
            else{
                return Rbs(arr,target,m+1,e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return Rbs(arr,target,m+1,e);
        }

        return Rbs(arr,target,s,m-1);
    }
}
