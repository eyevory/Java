
public class javaPrintVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // name variable + println
        String name = "Bob";
        System.out.println("Hello " + name);
        
        // first&last name variables
        String firstName = "John";
        String lastName = "Longson";
        
        // Combine the name variables into fullname variable
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        // two int variables "84" and "22"
        float x = 84;
        float y = 22;
        
        // addition, substraction, multiplication, division
        /*
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        
        int z = 10;
        System.out.println(x + z * y);
        */

    // addition, subtraction, multiplication, division
        printFloat(x + y);
        printFloat(x - y);
        printFloat(x * y);
        printFloat(x / y);

    int z = 10;
    System.out.printf("%.1f%n", x + z * y);

    }   
    public static void printFloat(float value) {
        if (value == Math.floor(value)) {
            System.out.println((int) value); // Print as integer if it's a whole number
        } else {
            System.out.println(value); // Print as float otherwise
        }
    }
}
