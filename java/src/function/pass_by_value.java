package function;

import java.util.Scanner;

public class pass_by_value {
    public static void main(String[] args) {
        System.out.println("enter two number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        //passing the vale of a and b in func is called pass by value.
        int ans = sum(a,b);


        System.out.println("sum is "+ans);
    }
    static int sum(int a , int b){
        int sum =a+b;
        return sum;

    }
}
