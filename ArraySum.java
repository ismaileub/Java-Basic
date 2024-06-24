import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        int sum=0;
        System.out.println("Enter five numbers");

        for (int i=0; i<numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
            sum+=numbers[i];
        }
        input.close();

        System.out.println("The sum of array = "+sum);
        System.out.println("The average is  = "+sum/5);
        
    }
}
