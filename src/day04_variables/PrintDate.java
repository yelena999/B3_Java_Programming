package day04_variables;

public class PrintDate {
    public static void main(String[] args) {
/*
    Task:
        declare and assign 3 variables
        the month number, the day number, and year number

        print the date in the following format:
            month/day/year

 */

                int month = 3;
                int day = 27;
                int year = 2024;
                //System.out.println(month// + day // + year);
                //System.out.println(month/day/year);
                System.out.println(month + "/" + day + "/" + year);
                System.out.println(month + "\\" + day + "\\" + year);
                System.out.println(month + "-" + day + "-" + year);
                System.out.println(month + "|" + day + "|" + year);
                System.out.println(month + "<>" + day + "<>" + year);
                //System.out.println(month + day + year); // 2054

    }
}
