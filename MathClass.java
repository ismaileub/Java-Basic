public class MathClass {
    
    public static void main(String[] args) {    // pvsm
        int x = 5;
        int y = 2;

        System.out.println( "Maximum = " +Math.max(x, y));   //sout
        System.out.println( "Minimum = " +Math.min(x, y));
        
       int  z = -15;
        System.out.println("Absolute of z = "+Math.abs(x));

        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+power);

        int round = Math.round(8.8f);
        System.out.println("Round value of 8.8 = "+round);

        double floor = Math.floor(6.8f);
        System.out.println("Floor value of 6.8 = "+floor);

        double ceil = Math.ceil(8.4f);
        System.out.println("Ceil value of 8.4 = "+ceil);

        System.out.println("The value of PI = "+Math.PI);

        
        System.out.println("The square root of 16 = "+Math.sqrt(16));
        System.out.println("The cube root of 27 = "+Math.cbrt(27));

        
    }
}
