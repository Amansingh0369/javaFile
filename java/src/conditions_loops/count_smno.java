package conditions_loops;

import java.util.Scanner;

public class count_smno {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int check_no = in.nextInt();
        int digit=0;
        int count =0;
        if (no == 0){
            System.out.println("1");
        }
        while(no !=0){
            digit = no %10;
            if(check_no == digit){
                count += 1;
            }
            no /= 10;
        }
        System.out.println(check_no+" comes " + count +" times");
    }
}
