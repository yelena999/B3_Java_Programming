package day25_methods;

import my_utilities.StringUtil;

public class FixFormat {
    public static void main(String[] args) {
        String str = "mickEy";
        System.out.println(fixFormat(str)); // I called firFormat method which is in the same class
        System.out.println(StringUtil.fixFormat("loopCAMP"));
    }
    public static String fixFormat (String str) {


        String result = "";
       // result = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
        result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();


        return result;
    }
}
