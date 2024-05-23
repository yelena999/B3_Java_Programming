package my_utilities;

public class StringUtil {


    // Make re-usable method.
        public static String reverse(String word) {

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);


        }
       return reversed;


    }

    /**
     * Return the formatter version of string
     *
     *return the first letter in Upper case and rest in Lowercase as String
     */

    public static String fixFormat (String str) {


        String result = "";
        // result = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
        result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();


        return result;
// System.out.println(reversed);

    }

    /**
     *Returns the number of the character repeated in String
     * @param word is the String that the method will check
     * @param letter is the char that the methode will check how many times it appear
     * @return the number of the letter that occurred in String
     */

    public static int frequencyOfCharacters(String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }


        return count;
    }

    /**
     * This methods return only unique characters
     * @param str is the word that is being checked for unique chars
     * @return the unique letter as a String
     */
    public static String uniqueCharacters(String str){
        String unique = "";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if(frequencyOfCharacters(str, eachLetter) == 1){
                unique += eachLetter;
            }


            if (!unique.contains(eachLetter + "")){
                unique += eachLetter;

            }
        }

        return unique;
    }
}


