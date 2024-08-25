import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Size:"+numbers.size());
        numbers.add(4);
        numbers.add(10);
        numbers.add(12);
        numbers.add(3,20);
        System.out.println(numbers);
        
        for(int num : numbers)
        {
            System.out.print(" "+num);
        }
        System.out.println();

        Iterator itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();

        numbers.remove(2);
        System.out.println(numbers);
        
        // numbers.removeAll(numbers);
        numbers.clear();
        System.out.println("After removing all value: "+numbers);

        boolean b = numbers.isEmpty();
        System.out.println(b);

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        boolean isHave = numbers.contains(30);
        System.out.println(isHave);

        int pos = numbers.indexOf(10);
        System.out.println("The index of 10 is : "+pos);

        numbers.set(2, 55);   //set replace a value not add new value   
        System.out.println(numbers);

        int x = numbers.get(1);
        System.out.println(x);


    }
}
