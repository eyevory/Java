
public class javaArrayExample {

    public static void main(String args[]) {
        int ages[] = {10, 15, 20, 25, 30, 35, 40, 45, 52};
        
        // float Variable to set sum and avg
        float avg, sum = 0;
        
        // Variable to take length of array
        int length = ages.length;
        
        // Loop to sum the ages in the array
        for(int age: ages) {
            sum += age;
        }
        
        // Declare avg value to calc out average
        avg = sum / length;
        
        // Print out avg
        System.out.println("The average age is: " +avg);
        
    }
}
