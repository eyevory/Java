
public class javaUppg5BetKalk {

    public static void main(String args[]) {
        
        // Variables
        int points = 67;
        
        // If else statements to check the points and assign a grade
        if(points >= 90){ // Checks if points above or at 90
            System.out.println("Grade: 5");
        }else if(points >= 80){ // Same as above but for 80
            System.out.println("Grade: 4");
        }else if(points >= 70){ // Same as above for 70
            System.out.println("Grade: 3");
        }else if(points >= 60){ // Same as above for 60
            System.out.println("Grade: 2");
        }else if(points >= 25){ // Same as above for 25
            System.out.println("Grade: 1");
        // If the student has below 25 points, prints out a grade of 0
        }else {
            System.out.println("Grade: 0");
        }
    }
}
