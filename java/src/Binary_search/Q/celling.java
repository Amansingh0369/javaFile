package Binary_search.Q;

public class celling {
    public static void main(String[] args) {
        int arr[] = {2,6,9,12,18,22,45,66};
        int target =67;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    //celling is the smallest number greater then or equal to the target.//
    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[0] < arr[arr.length - 1];

        //if target is last then return -1.
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return arr[start];
    }
}
