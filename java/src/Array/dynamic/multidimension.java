package Array.dynamic;

import java.util.ArrayList;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for(int i =0 ; i <3 ;i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i = 0 ; i < 2 ; i++){
            for(int j =0 ; j < 2 ; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);


        //sum
        System.out.print("sum of full dynarr : ");
        int allsum =0;
        int sum =0;
        for(int i = 0 ; i < 2 ; i++){

            for(int j =0 ; j < 2 ; j++){
                sum = sum + list.get(i).get(j);
            }
            System.out.print(sum +"  " );
            allsum = sum + allsum;
        }
        System.out.println();
        System.out.println("sum of multi dynamic array :"+allsum );



    }
}
