package day21_arrays;
/*
            Biggest substring of matching characters
                Given a String find the biggest substring of chars that match and print it.
                Ex: aaabbbcccccddddee Output: ccccc
 */
public class BiggestSubstring {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddeehhhhhhhhhjjj";
        String first = "";
        String longest = "";


        for (int i = 0; i < str.length()-1; i++) {


            first += str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1) ) { // When the character is not matching next one

                if (first.length() > longest.length()) {
                    longest = first;
                }

                first = "";

            }

            if ( i == str.length() - 2 ) {
                if (first.length() > longest.length()) {
                    longest = first;
                }

                first = "";
            }

        }

        System.out.println(longest);







    }

}