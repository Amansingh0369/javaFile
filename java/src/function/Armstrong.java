package function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number to check armstrong number: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println( isArmstorng(n));


    }

    static boolean isArmstorng(int n){
        int sum =0;
        int num = n;
        while(n!=0){
            int rem = n % 10;
             sum = rem*rem*rem + sum;
             n=n/10;

        }
        return sum == num;

    }
}
