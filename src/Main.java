
public class Main {
    public static void main(String[] args) {


        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // throws exception
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Exception caught: Index 5 out of bounds for length 3
        }


    }
}