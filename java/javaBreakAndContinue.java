
public class javaBreakAndContinue {

    public static void main(String args[]) {
        // Loop with break
        /*
        for(int i = 0; i < 11; i++) {
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
        */
        
        // Loop with continue where it does nothing
        /*
        for(int i = 0; i < 11; i++) {
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }
        */
        
        // Break sample
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
            if(i == 5) {
                break;
            }
        }
    }
}
