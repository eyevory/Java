
public class javaUppg3VarTyp {

    public static void main(String args[]) {
        // Variables
        int Var1 = 10;
        float Var2 = 22.3f;
        double Var3 = 52.1;
        char Var4 = 'B';
        // Call this Integer so we can referehce it via .byteValue()
        Integer Var5 = 120;
        
        // Print variables original values
        System.out.println("Var1 as int: " + Var1);
        System.out.println("Var2 as float: " + Var2);
        System.out.println("Var3 as double: " + Var3);
        System.out.println("Var4 as char: " + Var4);
        System.out.println("Var5 as int: " + Var5);
        
        /* Useless non functional code regarding the assignment
        // Declare new variables with values of old ones
        double Swap1 = Var1;
        double Swap2 = Var2;
        int Swap3 = Var3;
        int Swap4 = Var4;
        byte Swap5 = Var5;
        */
        
        // Print the variable values with new variable types
        System.out.println("\nVar1 int to double: " + (double)Var1);
        System.out.println("Var2 float to double: " + (double)Var2);
        System.out.println("Var3 double to int: " + (int)Var3);
        System.out.println("Var4 char to int: " + (int)Var4);
        
        // Gives Swap1 as the byte value of integer Var5
        byte Swap1 = Var5.byteValue();
        
        //Can be typed into a single line without the previous byte variable
        //System.out.println("Var5 int to byte: " +Var5.byteValue());
        
        // Print our Swap1 byte variable
        System.out.println("Var5 int to byte: " +Swap1);
        
    }
}
