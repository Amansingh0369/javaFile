package Recursion.level_1Q;

public class reverse {
    public static void main(String[] args) {
        int n = 1342;
//        reverse1(n);
//        System.out.println(sum);

        int ans = reverse_2(143);
        System.out.println(ans);
    }

    static int sum=0;
    static void reverse1(int n ){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    static int reverse_2(int n ){
        int digits = (int)(Math.log10(n))+1;
        return helper( n , digits);
    }

    static int helper(int n , int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
}
