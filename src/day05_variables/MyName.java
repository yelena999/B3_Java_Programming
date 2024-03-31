package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char first = 'f';
        char second = 'e';
        char third = 'y';
        char fourth = 'r';
        char fifth = 'u';
        char six = 'z';

        System.out.println(first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);
        System.out.println("six = " + six);

        System.out.println();

        System.out.println(first + second + third + fourth + fifth + six);  //int

        String name = "" + first + second + third + fourth + fifth + six;
        System.out.println(name);

        char letter1 = 'ӛ';
        System.out.println(letter1);
        char letter2 = 1243;
        System.out.println(letter2);
        letter2 = 43904;
        System.out.println(letter2);

        System.out.println(4 + 5 + "" + 55 + 21);
        //                  9 + "" + 55 + 21
        //                  "9" + 55 + 21
        //                  "955" + 21
        //

    }
}
