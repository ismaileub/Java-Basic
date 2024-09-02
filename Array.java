
public class Array {

    public static void main(String[] args) {
        int[] number;  //declaration
        number = new int[5];   //creation
        /**
         * ****************
         */
        int[] num = new int[10];     //creation & declaration
        int[] number2 = new int[15];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

        int len = number2.length;
        // System.out.println(len);
        System.out.println("Number2 array size : " + len);
        System.out.println(number[2]);

    }
}
