
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5,-6,12,7));

        System.out.println("Before sorting= "+numbers);

        Collections.sort(numbers);
        System.out.println("After sorting= "+numbers);


        /********************** */
        Collections.reverse(numbers);
        System.out.println("Descending order= "+numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order= "+numbers);


    }
}
