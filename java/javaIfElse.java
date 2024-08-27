
public class javaIfElse {

    public static void main(String args[]) {
        
        // If statement to check if a value is higher than another
        if(20 > 18){
            System.out.println("20 is greater than 18");
        }else{ // Else statement to give an error if it isn't higher
            System.out.println("Error");
        }
        
        // int variables
        int z = 20;
        int y = 19;
        
        // If statement checking if Z is greater than Y and vice versa
        if(z > y){
            System.out.println("Z is greater than Y");
        }else { // This prints if the opposite is true
            System.out.println("Y is greater or equal to X");
        }
        
        // If statement checking if the time is less than 18:00
        int time = 8;
        if(time < 18){
        // Prints good day/evening depending on the time
            System.out.println("Good Day");
        }else {
            System.out.println("Good Evening");
        }
        // Variable for time
        int time2 = 22;
        
        // If statement checking if the time is under 10, then if under 18
        // otherwise prints good evening
        if(time2 < 10){
            System.out.println("Good Morning");
        }else if(time2 < 18){
            System.out.println("Good Day");
        }else{
            System.out.println("Good Evening");
        }
    }   
        
}
