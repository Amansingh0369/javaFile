package conditions_loops;

import java.util.Scanner;

public class nev_pos_odd_sum {
    public static void main(String[] args) {
        System.out.println("enter the numbers: ");
        Scanner in= new Scanner(System.in);
        int n=10000;
        int nsum=0;
        int psum=0;
        int osum=0;
        while(n !=0){
            n=in.nextInt();
            if(n<0){
                nsum = n + nsum;

            }
            else if(n>0){
                psum = n + psum;
                if (n%2 !=0) {
                    osum =  n+ osum;
                }
            }

        }
        System.out.println("positive no sum : "+ psum);
        System.out.println("negative no sum : "+ nsum);
        System.out.println("odd no sum : "+ osum);

    }
}
