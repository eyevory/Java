
public class javaIfElse2 {

    public static void main(String args[]) {
        // Option 1
        int time = 20;
        
        if(time < 18){
        // Prints good day/evening depending on the time
            System.out.println("Good Day");
        }else {
            System.out.println("Good Evening");
        }
        
        // Option 2
        
        // result function to check the same as above true or false
        String result = (time < 18)? "Good Day" : "Good Evening";
        System.out.println(result);
        
        // Example on Else If
        int Num = 3;
        
        // Checks if the value is positive
        if(Num > 0){
            System.out.println("The value is positive");
        // Checks if the value is negative
        }else if(Num < 0){
            System.out.println("The value is negative");
        // Checks if the value is 0
        }else if(Num == 0){
            System.out.println("The value is 0");
        // Returns error if not a valid int number or something else went wrong
        }else{
            System.out.println("Error, no valid integer value");
        }
    }
}
