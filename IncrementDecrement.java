public class IncrementDecrement {
    public static void main(String[] args) {
        int x =25;
        int y;

        y = x++;   //25
        System.out.println("Y = "+y);

        y = x;   //26
        System.out.println("Y = "+y);

        System.out.println("********");
        
        x = 25;
        y = ++x;   //26
        System.out.println("Y = "+y);

        y = x;   //26
        System.out.println("Y = "+y);

        System.out.println("********");

        x = 25;
        y = x--;   //25
        System.out.println("Y = "+y);  

        y = x;   //24
        System.out.println("Y = "+y);

        System.out.println("********");
        
        x = 25;
        y = --x;   //26
        System.out.println("Y = "+y);

        y = x;   //26
        System.out.println("Y = "+y);
    }
    
}
