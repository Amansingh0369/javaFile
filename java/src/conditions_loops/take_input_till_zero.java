package conditions_loops;

import java.util.Scanner;

public class take_input_till_zero {
    public static void main(String[] args) {
        System.out.println("Enter no: ");
        Scanner in = new Scanner(System.in);
        int num =10000;
        int sum =0;
        while( num != 0){
             num = in.nextInt();
             sum = sum + num ;
        }
        System.out.println("sum of all number that u have enterd: "+ sum);
    }


}
