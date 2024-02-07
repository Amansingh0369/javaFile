package Binary_search;

public class Order_Agostic_BS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASC = arr[0] < arr[arr.length - 1];
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
