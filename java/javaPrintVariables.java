
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
    
    boolean isCodingFun = true;
    boolean funOutDoorDay = false;
        System.out.println("Is codng fun? ");
        System.out.println(isCodingFun);
        System.out.println("Is it fun to go outside against your will? ");
        System.out.println(funOutDoorDay);

    // Example 1
    // Variables for data types
    int items = 54;
    float costPerItem = 6.99f;
    float totalCost = items * costPerItem;
    char currency = '$';
    
    // Print Variables
        System.out.println("Number of items: " +items);
        System.out.println("Cost per item: " +costPerItem + currency);
        System.out.println("Total cost: " +totalCost + currency);
    
    }   
    public static void printFloat(float value) {
        if (value == Math.floor(value)) {
            System.out.println((int) value); // Print as integer if it's a whole number
        } else {
            System.out.println(value); // Print as float otherwise
        }
    }
}
