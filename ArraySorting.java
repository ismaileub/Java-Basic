import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        int[] number = {-5, 10, 3, 5, 9} ;
        Arrays.sort(number);


        System.out.println("Ascending: ");
    
        for (int num : number) {
            System.out.print(num +" ");
            
        }

        

        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        System.out.println("\nThe first fruit is: " + fruits[0]);
        Arrays.sort(fruits);

        for (int i = 0; i < 4; i++) {
            System.out.println(fruits[i]);
        }



    }

    
}
