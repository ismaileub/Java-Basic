import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.println("Enter two number :");
        num1  = input.nextInt();
        num2  = input.nextInt();
        large = (num1>num1)? num1:num2;
        System.out.println("Large Number : "+large);
    }
    
}
