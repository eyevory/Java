
public class javaUppg7ArrLoop {

    public static void main(String args[]) {
        // Declare array and its elements
        int num[] = {10, 20, 30, 40, 50};
        
        // Declare sum variable, start value of 0
        int sum = 0;
        
        // Print first and last number of array starting count from 0
        System.out.println("First number of the array: " +num[0]);
        System.out.println("Last number of the array: " +num[4]);
        
        // For loop assigning "sum" variable the sum of elements in "num" array
        for(int nums: num) {
            sum += nums;
        }
        
        // For loop to print sum and the sum divided by two
        for(int i = 0; i < 2; i++) {
        // Checks if the "i" int value is 1 a.k.a has it looped once
            if(i == 1){
                System.out.println("\nSum of the array divided by two: " +(sum / 2));
        // Stop the loop
                break;
            }
        // Print sum of array if loop runs first time
            System.out.println("\nSum of the array: " +sum);
            
        }
        
        // BONUS:
        // Declare new int var and give it value of first element in array
        int high = num[0];
        
        // For loop to set value of "high" to highest element
        for(int i = 0; i < num.length; i++){
        // if loop that compares the element in an array to the value of "high"
        // and sets it to that element value if it is higher
            if(num[i] > high){
                high = num[i];
            }
        }
        // Print the variable that is set to highest element in array
        System.out.println("\nLargest value in num array: " +high);
    }
}
