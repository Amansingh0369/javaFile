package basic;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enetr temp in c: ");
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5 )+ 32;
        System.out.println("temp in f is : " + tempf);

    }
}
