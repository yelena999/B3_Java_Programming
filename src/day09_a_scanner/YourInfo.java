package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter you favorite book: ");
            String bookName = input.nextLine();

            System.out.print("Enter you age: ");
            byte age = input.nextByte();

            System.out.print("Enter your favorite number: ");
            long favoriteNum = input.nextLong(); // ENTER - RETURN


            System.out.println("Information:");
            System.out.println("\t" + age);
            System.out.println("\t" + favoriteNum);
            System.out.println("\t" + bookName);


        }
    }
