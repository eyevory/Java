
public class javaStrings {

    public static void main(String args[]) {
        // String variable called greetings
        String greetings = "Hello";
        System.out.println(greetings);
        
        // Length of a text
        /*
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        */
        
        // Print in upper and lower case
        String txt = "Hello Class";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        // White spaces included in indexing of text
        String txt2 = "The length of the txt string is";
        System.out.println(txt2.indexOf("of"));
        
        // How to include quotes in a text 
        String txt3 = "The grind never stops \"grind\"";
        System.out.println(txt3);
        
        // New line in a text string \n
        String txt4 = "We are grinding \ntoday";
        // Tab distance in a text string \t
        String txt5 = "We are grinding \ttoday";
        
        System.out.println(txt4);
        System.out.println(txt5);
    }
}
