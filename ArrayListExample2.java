
import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers1.add(5);
        numbers1.add(9);
        numbers1.add(15);

        numbers2.add(11);
        numbers2.add(33);
        numbers2.add(22);

        numbers3.addAll(numbers1);
        System.out.println(numbers1);
        System.out.println(numbers3);

        boolean result = numbers1.equals(numbers2);
        System.out.println(result);

    }
}
