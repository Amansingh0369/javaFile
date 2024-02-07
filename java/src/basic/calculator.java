package basic;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter two number : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Enter operand : * , + , - , /");
        String op = in.next();
        int ans=0;
        if(op.equals("+")) {
            ans = num1 + num2;
            System.out.println(ans);
        }
        else if (op.equals("-")) {
            ans = num1 - num2;
            System.out.println(ans);
        }
        else if (op.equals("*")) {
            ans = num1 * num2;
            System.out.println(ans);
        }
        else if (op.equals("/")) {
            ans = num1 / num2;
            System.out.println("ans is : " + ans);
        }
    }
}
