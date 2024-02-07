package Linear_search;

public class basic {
    public static void main(String[] args) {
        int nums[]={22,11,23,46,2,3,66,74};
        int target = 66;
        System.out.println(linearSeacrh(nums,target));

    }
    static int linearSeacrh(int arr[],int target){

        if(arr.length ==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }

        return -1;
    }
}
