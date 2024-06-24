import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double number2;
        String name;

        System.out.print("Enter any number: ");
        number = input.nextInt();
        input.nextLine();  // Consume the newline left-over

        // The nextLine() is added to consume the newline character left in the input buffer.
        // This ensures that input.nextLine() properly waits for the user's input for the name.

        System.out.print("Enter any double number: ");
        number2 = input.nextDouble();
        input.nextLine();  // Consume the newline left-over

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Number = " + number);
        System.out.println("Number2 = " + number2);
        System.out.println("Welcome = " + name);

        input.close();   // Close the Scanner
    }
}
