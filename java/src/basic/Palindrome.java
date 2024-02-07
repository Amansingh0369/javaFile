package basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("eneter a number: ");
        int num = in.nextInt();
        int num2=num;
        int digit=0;
        int ans =0;
        int i=0;
        while( num !=0) {
            digit = num % 10;
            ans = (ans * 10) + digit;
            num = num / 10;
        }
        if(ans == num2){
            System.out.println("Palindrome " + ans);
        }
        else {
            System.out.println("not Palindrome "+ ans);
        }
    }
}
