
public class javaUppg8LoopBre {

    public static void main(String args[]) {
        // Loop that prints "i" value until it reaches loop 11
        for(int i = 0;i < 30; i++) {
        // Checks if "i" value is 11, if it is: Prints a statement and breaks loop
            if(i == 11) {
                System.out.println("Loop terminated early due to break statement");
                break;
            }
        // Prints current value of "i" in loop
            System.out.println(i);
        }
    }
}
