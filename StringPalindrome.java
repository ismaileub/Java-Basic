
public class StringPalindrome {

    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        String result = s1.equals(s2) ? "Palindrome" : "Not Palindrome";

        System.out.println(result);

    }
}
