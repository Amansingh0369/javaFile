package Recursion.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args){
//    permutation("","abc");
        ArrayList<String> list = new ArrayList<>();
        permutationlist("","abc",list);
//        Collections.sort(list);
        System.out.println(list);
//        System.out.println(permutationcount("","AAB"));
    }

    static ArrayList<String> permutationlist(String p , String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i =0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationlist(f  + ch + s, up.substring(1),list));
        }
        return ans;
    }
    static int permutationcount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i =0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationcount(f  + ch + s, up.substring(1));
        }
        return count;
    }
}
