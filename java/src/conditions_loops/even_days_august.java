package conditions_loops;

import java.util.Scanner;

public class even_days_august {
    public static void main(String[] args) {
        System.out.println("month no:  ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        int month = 0;

         if(n%2==0){
            for (int i = 1; i <= 30; i++) {
                month +=1;
                if(month %2 ==0){
                    count++;
                }
            }

        }
        else{
            for (int i = 1; i <= 31; i++) {
                month +=1;
                if(month %2 ==0){
                    count++;
                }
            }
        }

        System.out.println("kunal can go outside in "+ n+" month "+ count +" times");
    }
};
