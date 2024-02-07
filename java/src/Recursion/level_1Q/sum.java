package Recursion.level_1Q;

public class sum {
    public static void main(String[] args) {
        int n =10;
        int ans = sum(10);
        System.out.println(ans);
    }
    static int sum(int n){
        int ans = 0;
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
}
