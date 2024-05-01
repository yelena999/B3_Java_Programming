package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {

        // "abcdef" -- > 6 - even -- > cd
        // "abcde"  -- > 5 - odd  -- > c

        String str = "abcde";  //  5
        //            01234
        //            length()/2 -- > 2,  3

        String evenOrOdd = "";


        if (str.length() % 2 == 0) { // even

            evenOrOdd = str.substring( str.length()/2 - 1, str.length()/2 +1);  // 2, 3 -- > c

        } else {  // odd

            //evenOrOdd = str.substring(str.length()/2, str.length()/2 + 1);
            evenOrOdd = str.charAt(str.length()/2)+"";

        }

        System.out.println(evenOrOdd);

    }
}

