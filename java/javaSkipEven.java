
public class javaSkipEven {

    public static void main(String args[]) {
        // Loop 1-10
        for(int i = 1; i <= 10; i++) {
            // if even skip
            if(i%2 == 0) {
                // Skips in the loop
                continue;
            }
            // Print the odd numbers
            System.out.println(i);
        }
    }
}
