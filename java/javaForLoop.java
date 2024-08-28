
public class javaForLoop {

    public static void main(String args[]) {
        // For loop basic sample
        /*
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        */
        
        // For loop basic sample 2
        /*
        for(int i = 0; i <= 10; i = i +2) {
            System.out.println(i);
        }
        */
        
        // For loop basic sample 3 "for each"
        // Array
        /*
        String[] name = {"John", "Bob", "Peter", "Francis", "Emma"};
        for(String i : name) {
            System.out.println(i);
        }
        */
        
        // For loop basic sample 4 "nested"
        /*
        for(int i = 1; i <= 2; i++) {
            System.out.println("Outside: " +i); // Runs 2 times
        
        for(int j = 1; j <= 3; j++) {
            System.out.println("Inside: " +j); // Runs a total of 6 times (2*3)
            }
        }
        */
        
        // For loop basic sample 5
        
        int number = 3;
        for(int i = 1; i <= 10; i++) {
            // Multiplication table up to * 10 based on int value
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
