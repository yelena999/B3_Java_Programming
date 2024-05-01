package day15_string;

import java.util.Scanner;

public class Title {


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name with titles: ");
        String name = key.nextLine().toLowerCase(); //  Tom Jerry Sr.

        // Mr. Tom Jerry
        // Mister. Tom Jerry

        // Ms. Tom Jerry
        // Miss. Tom Jerry
        // Madam. Tom Jerry

        // Dr. Tom Jerry

        // Tom Jerry Sr.
        // Tom Jerry Jr.

        if (name.startsWith("mr.") || name.startsWith("mister.")) {
            System.out.println ("Hello Sir. ");
        } else if (name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("madam")) {
            System.out.println ("Hello Ma'am ");
        } else if (name.startsWith("dr.")) {
            System.out.println ("Hello Doctor. ");
        }


        if (name.endsWith("sr.")) {
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith("jr.")){
            System.out.println(" Nice to meet you Junior");
        }








    }
}
