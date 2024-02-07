package Recursion.subset_subsequence_string;

public class String_skip {
    public static void main(String[] args) {
//        System.out.println(Skip("iamapple"));
        System.out.println(SkipAppNotApple("amanisappale"));
    }

     static String Skip(String up) {
         if(up.isEmpty()){
             return "";
         }
         if(up.startsWith("apple") ){
             return Skip(up.substring(5));
         }else {
             return up.charAt(0) + Skip(up.substring(1));
         }
    }

    static String SkipAppNotApple(String up) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple") ){
            return SkipAppNotApple(up.substring(3));
        }else {
            return up.charAt(0) + SkipAppNotApple(up.substring(1));
        }
    }
}
