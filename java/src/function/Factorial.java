package function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial of it:");
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

     static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }

         return f;
    }
}
