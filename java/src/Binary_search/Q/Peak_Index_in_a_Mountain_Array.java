package Binary_search.Q;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {

//        1st approch(linear search)..!

//        int max = arr[0];
//        int k=0;
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//                k=i;
//            }
//        }
//        return k;

         //2nd approch(binar search of mountain array)...!

        int arr[]={5,1,3};
        System.out.println(mountainsearch(arr));

    }
    static int mountainsearch(int arr[]){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + ( end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
