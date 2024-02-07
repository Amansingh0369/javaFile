package string;

public class SB {
    public static void main(String[] args) {
        StringBuilder bulider = new StringBuilder();
        for(int i = 0 ; i < 26; i++){
            char a = (char)('a' + i);
            bulider.append(a);
        }
        System.out.println(bulider.toString());
        System.out.println(bulider.length());
    }

}