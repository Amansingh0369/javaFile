package Recursion;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,3,8,12,18,22};
        int target = 18;
        int ans = r_search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int r_search(int[] arr,int target,int s,int e){
        int mid = s + ( e - s ) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            r_search(arr,target,s,mid-1);
        }

        return r_search(arr,target,mid+1,e);
    }
}
