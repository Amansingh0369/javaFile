package string;

import java.util.ArrayList;

public class operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.print('a'+3+"=");
        System.out.println((char)('a'+3));
        System.out.println('a'+"A");
        System.out.println("a"+"b");
        System.out.println("Aman"+new ArrayList<>());
        System.out.println("Aman "+ new Integer(3));
        System.out.println(new ArrayList<>()+ " "+new Integer(4));
        String ans =  new Integer(10 ) +" "+ new ArrayList<>();
        System.out.println(ans);
    }
}
