
public class javaBooleans {

    public static void main(String args[]) {
        
        // Boolean variables
        /*
        boolean isJavaAss = true;
        boolean isJavaGreat = false;
        
        System.out.println(isJavaAss);
        System.out.println(isJavaGreat);
        */
        
        /*
        int x = 15;
        int y = 9;
        
        // Check if math statements are true or false
        System.out.println(x > y);
        System.out.println(x < y);
        
        System.out.println(52 > 20);
        System.out.println(x == 12);
        System.out.println("Does x = 15?: " + (x == 15));
        */
        
        int Age = 5;
        int RightToVote = 18;
        
        // Check if age is enough to vote with print function
        //System.out.println(Age >= RightToVote);
        
        // If statement to check if age is equal or older than 18, then print
        // different text strings based on if true or false
        if(Age >= RightToVote) {
            System.out.println("Old enough to vote!");
        }else {
            System.out.println("Not old enough to vote...");
        }
        
    }
}
