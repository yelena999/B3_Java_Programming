package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
// We can declare multiple variables on the same line if they have same datatype
        //String word1;
        //String word2;
        String word1, word2;

        // We can declare and assign values to multiple variables on the same line if they have same datatype
        String houseType = "Penthouse", fullAddress = "12345 Test St";

        int numOfBedroom = 4;
        int numOfBathroom = 3;
        int numOfKitchen = 2;
        int zipCode = 54321;

        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isOnSale = false;
        boolean hasPark = true;

        double costOfHouse = 999_999.99;
        double schoolRating = 4.9;


        String houseInfo = "The " + houseType + " on " + fullAddress + ", " + zipCode + " costs $" + costOfHouse + "\n\tThe " + houseType + " has the attic: " + hasAttic + ", \n\thas a pool: " + hasPool + " \n\tis on sale: " + isOnSale + ", \n\thas a park: " + hasPark + ". \n\tThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);










    }
}
