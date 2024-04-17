package day08_scanner_logical_operators;

public class AgeGroup {
    public static void main(String[] args) {
/*
task:

    declare and assign an age variable

    is the person a kid ( up to 13, include 13)

    is the person a senior citizen ( 65 and above)

 */

         {

                int personAge = 40;

                boolean isKid = personAge <= 13;
                boolean isSenior = personAge >= 65;


                System.out.println("The person is kid: " + isKid);
                System.out.println("The person is senior: " + isSenior);



            }
        }

    }
