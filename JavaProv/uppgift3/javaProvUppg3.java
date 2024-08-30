
public class javaProvUppg3 {

    public static void main(String args[]) {
        
        /* Faulty code
        
         public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 5; i+); {
            System.out.println(Number: " + i);
        }
    }
}
        */
        
        /* Issues with faulty code part
        1. Missing + sign after i+ in for loop function: i+" ") {
        2. Unnecessary semicolon after for function parameters: i++)";" {
        3. Missing quote mark at start of print string: --> Number: "
        4. For loop repeats too many times, either change i <= 5 to: i <= 4 OR i < 5
        */
        // Fixed code
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
