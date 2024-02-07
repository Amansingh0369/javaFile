package basic;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter a  number: ");
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();;
        int a=0;
        int b=1;

        for(int i=0;i<=n;i++){
            System.out.println(a +",");
            int c=a+b;
            a=b;
            b=c;
        }

    }
}
