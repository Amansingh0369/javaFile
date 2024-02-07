package basic;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        System.out.println("whats ur name: ");
        Scanner input=new Scanner(System.in);
        System.out.println(input.nextLine());
        int n= input.nextInt();
    }
}