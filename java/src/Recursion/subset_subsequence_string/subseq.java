package Recursion.subset_subsequence_string;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
//        System.out.println(subseq("", "abc"));
//        System.out.println(subseqRet("","AAB"));
//        System.out.println(subseqRetAscii("","abc"));

    }

    static int subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1 ;
        }

        int count = 0;
        char  ch = up.charAt(0);
        count+=subseq(p + ch , up.substring(1));
        count+=subseq(p, up.substring(1));
        return count;
    }
    static ArrayList<String> subseqRet (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqRetAscii (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqRetAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqRetAscii(p, up.substring(1));
        ArrayList<String> third = subseqRetAscii(p + (ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
