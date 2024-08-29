
public class javaArrays {

    public static void main(String args[]) {
        // String array
        String[] names = {"Bob", "Steve", "Patrick"};
        // Int array
        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        // Always start with "0" instead of "1"
        System.out.println(names[0]);
        System.out.println(numbers[0]);
        
        // Length of an array
        System.out.println(names.length);
        System.out.println(numbers.length);
        
        // Loop printing out names from start of array
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        // Loop printing out numbers from start of array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            
    }
}
