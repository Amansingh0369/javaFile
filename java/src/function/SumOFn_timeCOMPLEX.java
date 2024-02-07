package function;

import java.util.Scanner;

public class SumOFn_timeCOMPLEX {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum (int n){
        return n*(n+1)/2;
    }
}
