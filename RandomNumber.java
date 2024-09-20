
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(6) + 5;

        System.out.println("Random Number: " + randomNumber);

        //another way
        int ran = (int) (Math.random() * 10) + 1;
        System.out.println(ran);

    }
}
