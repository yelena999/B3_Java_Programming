package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaahiahhihibbbcch";  // hi
        //            0123456789.......
        int count = 0;

        for (int index = 0; index < str.length()-1;  index++){

            if(str.charAt(index) == 'h' && str.charAt(index+1) == 'i') {
                count++;
            }

        }
        System.out.println(count);

    }
}
