package basic;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollno = input.nextInt();
        System.out.println("ur rollo no is: "+ rollno);

        String Name = input.next();
        System.out.println("hello "+Name);

        float marks = input.nextFloat();
        System.out.println("ur marks is :"+marks);
    }
}
