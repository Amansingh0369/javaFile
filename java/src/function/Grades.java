package function;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter marks : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ans = check_grades(n);
        System.out.println(ans);

    }

    static char check_grades(int n){
        if(n>90){
            return 'A';
        } else if (n<90 && n>80) {
            return 'B';
        }
        else if (n<80 && n>70) {
            return 'c';
        }
        else if (n<70 && n>60) {
            return 'D';
        }
        else if (n<60 && n>50) {
            return 'E';
        }

        return 'f';
    }
}
