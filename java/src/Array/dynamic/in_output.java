package Array.dynamic;

import java.util.ArrayList;
import java.util.Scanner;

public class in_output {
    public static void main(String[] args) {
        System.out.println("enter the values :");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> dynamic = new ArrayList<>();

        for(int i = 0 ; i<5 ; i++){
            dynamic.add(in.nextInt());
        }
        dynamic.set(1,0);
        dynamic.remove(4);
        int sum = 0;
        for(int i = 0 ; i<4 ; i++){
            System.out.print(dynamic.get(i)+" + ");
            sum = dynamic.get(i)+sum;
        }
        System.out.print( " = "+sum);

        // System.out.println(dynamic);
    }
}
