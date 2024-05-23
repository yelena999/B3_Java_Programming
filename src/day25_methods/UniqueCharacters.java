package day25_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("hello"));//heo
        System.out.println(StringUtil.uniqueCharacters("loopcamp"));
    }






    public static String uniqueCharacters(String str){
     String unique = "";
     String checked = "";
        for (int i = 0; i < str.length(); i++) {
        char eachLetter = str.charAt(i);
         if(StringUtil.frequencyOfCharacters(str, eachLetter) == 1){
             unique += eachLetter;
         }


        if (!unique.contains(eachLetter + "")){
                unique += eachLetter;

            }
        }

        return unique;
    }
}
