package Recursion.level_1Q;

public class product_of_digits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = product_digits(n);
        System.out.println(ans);
    }

    static int product_digits(int n){
        if(n%10==n){
            return n;
        }
        int r = n%10;

        return r * product_digits(n/10);
    }
}
