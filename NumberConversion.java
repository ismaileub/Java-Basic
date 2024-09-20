
public class NumberConversion {

    public static void main(String[] args) {
        //some thing to decimal 
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal = " + decimal);

        //decimal to binary
        int decimal1 = 15;
        String octal = Integer.toOctalString(decimal1);
        System.out.println("octal = " + octal);

        String binary1 = Integer.toBinaryString(decimal1);
        System.out.println("Binary = " + binary1);

    }
}
