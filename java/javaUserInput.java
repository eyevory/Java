import java.util.Scanner; // Import Scanner class
public class javaUserInput {
    
    public static void main(String args[]) {
        Scanner text = new Scanner(System.in); // Create the scanner object
        System.out.println("Enter your name");
        
        // Read the scanner object for user input
        String userName = text.next();
        System.out.println("Your name is: " + userName);
    }
}
