package Binary_search.Q;

public class Find_in_Mountain_Array {
    public static void main(String[] args) {
        int arr[]={10,15,12,16,14,20,18,30,26};
        int target= 14;
        System.out.println(ans(arr,target));
    }
    static int ans(int nums[],int target){
        int peak = mountainsearch(nums);
        int firsttry = search(nums,target,0,peak);

        if(firsttry != -1){
            return firsttry;
        }
        return search(nums,target,peak+1,nums.length-1);

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
    static int search(int arr[], int target,int start,int end) {
        boolean isASC = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
