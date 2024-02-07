package basic;

import java.util.Scanner;

public class even_odd{
    public static void main(String[] args) {
        System.out.print("enter a no: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num == 0){
            System.out.println("none");
        }
        else if( num % 2 == 0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
