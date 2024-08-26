
public class javaDataTypes {


    public static void main(String args[]) {
        // Example 1
        /*
        int myInt = 10;
        double myDouble = myInt;
        double myFloat = myInt;
        
        
        System.out.println(myInt);
        System.out.println(myFloat / 2);
        System.out.println(myDouble / 9);
        */
        
        /*
        double myDouble = 9.7888888;
        int myInt = (int)myDouble;
        
        
        System.out.println(myDouble);
        System.out.println(myInt);
        */
        
        // Example 2
        
        // int Score variable
        int Score = 720;
        
        // int userScore variable
        int userScore = 349;
        
        // float percentage to calculate users score out from maximum Score
        float percentage = (float) userScore / Score * 100.0f;
        System.out.println("Users percentage is: " + percentage);
    }
}
