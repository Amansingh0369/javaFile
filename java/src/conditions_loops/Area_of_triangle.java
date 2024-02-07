package conditions_loops;

import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        System.out.println("enter the base and height of triangle: ");
        Scanner in = new Scanner(System.in);
        int b= in.nextInt();
        int h = in.nextInt();
        int area = ( b*h) / 2 ;
        System.out.println("Area of triangle is : "+ area);

    }
}
