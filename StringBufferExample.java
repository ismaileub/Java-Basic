public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new  StringBuffer("Ismail");

        System.out.println(sb);

        sb.append(" Hossain ");
        sb.append(25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.reverse();
        sb.setLength(6);
        System.out.println(sb);

        String str = new String();
        str = "Anisul Islam";
        StringBuffer strB = new StringBuffer(str);
        
        System.out.println(strB);

    }
}
