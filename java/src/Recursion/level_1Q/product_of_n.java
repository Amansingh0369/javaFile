package Recursion.level_1Q;

public class product_of_n {
    public static void main(String[] args) {
        int n =10;
        int ans = pro(5);
        System.out.println(ans);
    }
    static int pro(int n){
        int ans = 0;
        if(n<=1){
            return 1;
        }
        return n*pro(n-1);
    }
}
