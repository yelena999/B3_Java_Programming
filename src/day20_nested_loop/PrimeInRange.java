package day20_nested_loops;

import java.util.Scanner;

/*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class PrimeInRange {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number to check all the number up to that and find primes: ");
        int num = key.nextInt(); // 50 --  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47



        for (int i = 1; i <= num; i++) {

            //int num = 7;
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j == 0)) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + ", ");
            }


        }



    }
}
