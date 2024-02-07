package Recursion.level_1Q;

public class o1_to_n {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }

    static void print(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}
