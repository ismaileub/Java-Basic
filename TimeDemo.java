
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String timeFormatter = time.format(formatter);
        System.out.println(timeFormatter);

    }
}
