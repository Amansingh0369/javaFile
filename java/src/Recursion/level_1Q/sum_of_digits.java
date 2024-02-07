package Recursion.level_1Q;

public class sum_of_digits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = sum_digits(n);
        System.out.println(ans);
    }

    static int sum_digits(int n){
        if(n==0){
            return 0;
        }
        int r = n%10;

        return r + sum_digits(n/10);
    }
}
