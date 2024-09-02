
public class String2 {

    public static void main(String[] args) {
        String firstName = "Ismail";
        String lastName = " Hossain";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String upper = fullName.toUpperCase();
        System.out.println(upper);

        boolean b = fullName.startsWith("I");
        System.out.println("First Letter = " + b);

        boolean v = fullName.endsWith("n");
        System.out.println("Last Letter = " + v);

        int[] numbers = new int[10];

        String[] fruits = {"Apple", "Banana", "Cherry"};  // String array

        String country = "Bangladesh is my country";

        char ch = country.charAt(0);
        System.out.println("ch = " + ch);

        int value = country.codePointAt(0);
        System.out.println("Value = " + value);

        int pos = country.indexOf("is");
        System.out.println("Position = " + pos);

        int lastPos = country.lastIndexOf("n");
        System.out.println("Last position = " + lastPos);

        String str = "  I   am   a    CSE     student   ";
        String s = str.trim();
        System.out.println(s);

    }
}
