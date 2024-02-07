package conditions_loops;

import java.util.Scanner;

public class Alphabet_check {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch>='a'  && ch <='z'){
            System.out.println("lower case " + ch);
        }
        else {
            System.out.println("UPPER CASE " + ch);
        }
    }

}
