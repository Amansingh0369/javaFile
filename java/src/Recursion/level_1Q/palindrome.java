package Recursion.level_1Q;

public class palindrome {
    public static void main(String[] args) {
        boolean ans  = palindrome(121);
        System.out.println(ans);
    }

    static boolean palindrome(int n )
    {
        return n == reverse_2(n);
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
