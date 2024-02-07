package Linear_search;

import java.sql.SQLOutput;

public class string_search {
    public static void main(String[] args) {
        String s = "Aman is ";
        char t = 'm';
        System.out.println(search(s,t));

    }

    static int search(String s,char t){
        if(s.length()==0){
            return -1;
        }
        for(int i=0;i< s.length();i++){
            if(t == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
