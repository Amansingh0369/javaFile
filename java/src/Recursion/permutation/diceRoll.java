package Recursion.permutation;

import java.util.ArrayList;

public class diceRoll {
    public static void main(String[] args) {
        Dice("",4);
        System.out.println(DiceFace("",4,8));
    }
    static void Dice(String p, int target){
        if(target == 0 ){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            Dice(p+i, target - i);
        }
    }

    static ArrayList<String> Dicelist(String p, int target, int face){
        if(target == 0 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
           list.addAll(Dicelist(p+i, target - i, face));
        }
        return  list;
    }

    static ArrayList<String> DiceFace(String p, int target,int face){
        if(target == 0 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++){
            list.addAll(Dicelist(p+i, target - i,face));
        }
        return  list;
    }

}
