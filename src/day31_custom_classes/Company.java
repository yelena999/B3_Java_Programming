package day32_custom_classes;

public class Company {
    public static void main(String[] args) {
        day32_custom_classes.Employee emp1 = new day32_custom_classes.Employee("Tom", "SDET");
        System.out.println(emp1);

        day32_custom_classes.Employee emp2 = new day32_custom_classes.Employee("Micky", "QA", 123, 120_000.00);
        System.out.println(emp2);


        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();
    }
}