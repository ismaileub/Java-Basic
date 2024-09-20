
public class PrimitiveNonprimitive {

    public static void main(String[] args) {
        //Primitive -> Non primitive
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("S = " + s);

        boolean b = true;
        String s1 = Boolean.toString(b);
        System.out.println("S1 = " + s1);

        //Non Primitive -> Primitive
        String S = "123";
        // int I = Integer.parseInt(S);
        int I = Integer.valueOf(S);

        System.out.println("I = " + S);

    }
}
