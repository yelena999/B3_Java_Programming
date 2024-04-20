package day13_string;


public class StringMemory {
    public static void main (String [] args) {
        // Option 1 - by STRING LITERALS - just a double quotation
        String str1 = "java";

        // Option 2 - by 'new' KEYWORD --- > we actually create an OBJECT
        String str2 = new String("java");

        String str3 = "java";

        String str4 = "javac";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("-------");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3 );

        System.out.println(str1 == str4);

        String str5 = new String ("java");

        System.out.println(str2 == str5);

        // == ----- > with this relational operator, when it is used with String, it compares the MEMORY LOCATION.





    }
}