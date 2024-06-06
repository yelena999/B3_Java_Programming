package day31_custom_classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone X");
        System.out.println(phone1);
        //System.out.println(phone1.inputName);  // This is not VALID


        Phone phone2 = new Phone("IPhone 14 pro", "Apple", 512, 24.2);
        System.out.println(phone2);


        Phone phone3 = new Phone("Iphone 14 Max", "Apple");
        System.out.println(phone3);


        Phone phone4 = new Phone("IPhone 14 pro", "Apple", 0, 0.0);
        // This is just made to show that toString method can be modified the way you want. If you create object this way, the having if condition is not good approach.




    }

}