package string;

import java.util.Arrays;
import java.util.Scanner;

public class palindroem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String  s = in.next();
        boolean b = isPalindroem(s);
        System.out.println(b);

    }
     static boolean isPalindroem(String s){
            s = s.toLowerCase();
        for(int i =0;i<=s.length()/2;i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start!=end){
                return false;
            }
        }
         return true;
     }
}
