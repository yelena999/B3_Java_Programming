package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        // "200"
        /*
            Scanner key = new Scanner(System.in);
            String str = key.nextLine(); // "I have 300"
            String [] strArr = str.split(" ");
            String n = strArr[strArr.length-1]; // "300"
            // nums.add(n); // INVALID
         */
        nums.add(Integer.valueOf("200"));
        nums.add(300);
        nums.add(400);
        nums.add(700);
        nums.add(900);

        System.out.println(nums);
        System.out.println(nums.contains(200));
        System.out.println(nums.contains(250));


    }
}
