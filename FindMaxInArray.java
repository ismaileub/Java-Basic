import java.util.Arrays;

public class FindMaxInArray {
    public static void main(String[] args) {

        int[] numbers = {3, 5,  8, -1, 4, 10, 12};

        // Find the maximum value using Streams API
        int max = Arrays.stream(numbers).max().getAsInt();

       
        System.out.println("The maximum value in the array is: " + max);
    }
}
