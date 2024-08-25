public class String3 {
    public static void main(String[] args) {
        
        String s1 = "This my country";
        System.out.println(s1);
        String s2 = s1.replace("m", "n");
        System.out.println(s2);


        String[] s3 = s1.split(" ") ;
        System.out.println(s3);

        for(String s : s3){
            System.out.println(s);
        }


    }
}
