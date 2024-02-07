package Linear_search;

public class searchINrange {
    public static void main(String[] args) {
        int[] arr ={23,1,4,45,67,85};
        int target = 23;
        System.out.println(seacrh(arr,target,1,4));
    }

    static int seacrh(int arr[],int target,int start,int end){
        if(arr.length ==0){
            return -1;
        }

        for(int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }

        return -1;
    }
}
