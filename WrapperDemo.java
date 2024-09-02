
public class WrapperDemo {

    public static void main(String[] args) {
        //primitive -> object(autoboxing)
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + x);

        Integer z = x;  // autoboxing happened  here
        System.out.println("z = " + z);

        // object -> primitive (Unboxing)
        //Double D = new Double(10.25);
        Double D = Double.valueOf(10.25);  // Creating a Double object using valueOf

        double d = D.doubleValue();
        System.out.println("d =" + d);
    }
}
