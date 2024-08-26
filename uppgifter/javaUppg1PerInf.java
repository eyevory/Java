
public class javaUppg1PerInf {


    public static void main(String args[]) {
        // Declare variables
        String firstName;
        String lastName;
        int personAge;
        double personHeight;
        boolean isStudent;
        
        // Give values to variables
        // Values can be pulled from a database or list
        firstName = "John";
        lastName = "Lennon";
        personAge = 17;
        personHeight = 177.8;
        isStudent = true;
        
        // Print variable values as a nice looking list
        
        // Print first name
        System.out.println("First name: " + firstName);
        // Print last name
        System.out.println("Last name: " + lastName);
        // Print persons age value
        System.out.println("Age: " + personAge);
        // Print age with "cm" suffix
        System.out.println("Height: " + personHeight + "cm");
        // Print to check if person is a student
        System.out.println("Is a student: " + isStudent);
        
    }
}
