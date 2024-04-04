package day06_a_arithmetic_operators;

public class CastingExamples {
    public static void main (String [] args) {

        int num1 = 40;
        float num2 = num1; // int is smaller than float. IMPLICIT/ AUTOMATIC / WIDENING casting happens
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 10.5F;
        short num4 = (short)num3; // short is smaller than float. We need CASTING - EXPLICIT/MANUAL/NARROWING CASTING - DATA LOSS
        System.out.println(num3);
        System.out.println(num4);


        float num5 = 300.77F;
        byte num6 = (byte)num5; // byte is smaller than float. We need CASTING - EXPLICIT/MANUAL/NARROWING CASTING - DATA LOSS
        System.out.println(num5);
        System.out.println(num6);


        // I can convert char to int - because, each character ahs a number assigned to it.
        // So, I am actually, converting the number datatype to number datatype
        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        System.out.println('B');
        System.out.println((int)'B');

        System.out.println('&');
        System.out.println((int)'&');

        System.out.println('6');
        System.out.println((int)'6');




    }
}
