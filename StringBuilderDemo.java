
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Ismail");

        str.append(" Hossain ");
        str.append(123.5);

        System.out.println("Str = " + str);

        str.reverse();
        System.out.println(str);

        str.delete(2, 5);
        System.out.println(str);
    }
}
