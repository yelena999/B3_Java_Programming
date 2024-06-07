package day32_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "SDET");
        System.out.println(emp1);

        Employee emp2 = new Employee("Micky", "QA", 123, 120_000.00);
        System.out.println(emp2);


        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();
    }
}