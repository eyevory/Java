import java.util.Arrays;

public class javaProvUppg2 {

    public static void main(String args[]) {
        // Declare arrays
        int[] list1 = {5, 10, 25, 75, 125};
        int[] list2 = {50, 100, 250, 750, 25};
        // Declare variables for sum to be used in function
        int sum1 = 0;
        int sum2 = 0;
        // Function to sum elements in arrays and print
        // Keeps looping until list length reached
        for(int i = 0; i < list1.length; i++){
            sum1 += list1[i]; // Sums current element in array spot to sum1 variable
            if(i == (list1.length - 1)) { // When loop reached final array element, print it
                System.out.println("Sum of first array: " +sum1);
                break; // Stop loop
            }
        }
        // Same function as above for second array
        for(int i = 0; i < list2.length; i++){
            sum2 += list2[i];
            if(i == (list2.length - 1)) {
                System.out.println("Sum of second array: " +sum2);
                break;
            }
        }
        
        // Print out sums divided with each other in float for accuracy
        System.out.println("\nSecond array sum divided by first: " +((float)sum2 / (float)sum1));
        
        // BONUS: Remove specific element in array with loop
        // Create new array one size less than original
        int[] listrm1 = new int[list1.length - 1];
        // Index to be removed/skipped (0 is the first element in an array)
        int rmindex1 = 0;
        
        // Loop function to copy elements from original array except one to new array
        for(int r = 0, t = 0;r < list1.length; r++) {
            if(r == rmindex1) { // If index to be removed is reached, don't copy element
                continue;
            }
            listrm1[t++] = list1[r]; // Copy element otherwise to new array
        }
        // Same array and for loop code as above with new variables
        int[] listrm2 = new int[list2.length - 1];
        int rmindex2 = 4;
        
        for(int r = 0, t = 0;r < list2.length; r++) {
            if(r == rmindex2) { 
                continue;
            }
            listrm2[t++] = list2[r]; 
        }
        
        // Print the array before element removed and after
        System.out.println("\nFirst array before removal: " +Arrays.toString(list1));
        System.out.println("First array with first element removed: " +Arrays.toString(listrm1));
        System.out.println("\nSecond array before removal: " +Arrays.toString(list2));
        System.out.println("Second array with last element removed: " +Arrays.toString(listrm2));
    }
}
