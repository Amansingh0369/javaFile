package Linear_search;

import java.util.Stack;

public class minSEARCH {
    public static void main(String[] args) {
        int arr[] = {23,5,8,4,7,98};
        System.out.println(searchmin(arr));
    }

    static int searchmin(int arr[]){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
