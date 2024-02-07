package Recursion;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        //print number till 5;
         int n =1;
         print(n);
    }
    static void print(int n ){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
