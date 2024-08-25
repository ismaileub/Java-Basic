

public class String1 {
    public static void main(String[] args) {
        
        String s1 = "Anisul Islam";
        String s2 = new String("Anisul Islam");

        int len = s1.length();
        System.out.println(len);

        if (s1.equals(s2)) {           //s1.contains(s2)
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        String str1 = "Ismail Hossain";
        String str2 = "ismail hossain";

        if (str1.equalsIgnoreCase(str2)) {           
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        boolean con = str1.contains("ss");
        System.out.println(con);

        boolean b = str1.isEmpty();
        System.out.println(b);


    }
}
