package string;

public class performance {
    public static void main(String[] args) {
        String series = "";
//        for(int i = 0 ; i < 26; i++){
//             char a = (char)('a' + i);
//            series = series +  a;
//        }
       // System.out.println(series);
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < 26; i++){
            char a = (char)('a' + i);
            s.append(a);
        }
    }
}
//in this everytime new object is creatd for series becoz string are not mutable .
// so a,ab,abc,abc and soo on are the grabage values;
