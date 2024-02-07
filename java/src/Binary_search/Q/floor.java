package Binary_search.Q;

public class floor {
    public static void main(String[] args) {
        int arr[] = {2,3,7,9,15,18,22};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    //floor = floor is the greates number smaller then or equal to target..//
    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[0] < arr[arr.length - 1];

        if(target <arr[0]){
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
        return arr[end];

    }
}
