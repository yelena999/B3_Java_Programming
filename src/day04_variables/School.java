package day04_variables;

public class School {
    public static void main(String[] args) {
    /*
    Task:
        class name: School

        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5

            total number of students in your school


    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/

                int numberOfStudentsInGradeOne = 40;
                int numberOfStudentsInGradeTwo = 25;
                int numberOfStudentsInGradeThree = 34;
                int numberOfStudentsInGradeFour = 19;
                int numberOfStudentsInGradeFive = 29;


                int totalNumberOfStudents = numberOfStudentsInGradeOne + numberOfStudentsInGradeTwo + numberOfStudentsInGradeThree + numberOfStudentsInGradeFour + numberOfStudentsInGradeFive;


                double numberOfSchoolDays = 100.5;
                double numberOfSnowDays = 5.5;
                double averageGpaInSchool = 3.6;

                System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeOne);
                System.out.println("Number of students in Grade 2: " + numberOfStudentsInGradeTwo);
                System.out.println("Number of students in Grade 3: " + numberOfStudentsInGradeThree);
                System.out.println("Number of students in Grade 4: " + numberOfStudentsInGradeFour);
                System.out.println("Number of students in Grade 5: " + numberOfStudentsInGradeFive);

                System.out.println();

                System.out.println("Total number of students: \t" + totalNumberOfStudents);

                System.out.println("Number of  School days: \t" + numberOfSchoolDays);
                System.out.println("Number of Snow days: \t\t" + numberOfSnowDays);
                System.out.println("Average GPA in School: \t\t" + averageGpaInSchool);





            }
}
