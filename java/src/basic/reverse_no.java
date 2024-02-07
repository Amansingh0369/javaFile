package basic;

import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("eneter a number: ");
        int num = in.nextInt();
        int digit=0;
        int ans =0;
        int i=0;
        while( num !=0){
            digit = num % 10;
            ans = (ans*10)+ digit;
            num=num/10;
        }
        System.out.println("reversed ans: "+ans);
    }
}
