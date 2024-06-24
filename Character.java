
import java.util.Scanner;

public class Character {
    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";  
        return vowels.indexOf(ch) != -1;  // it return true or false
      }


    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in) ;
        char ch;
        System.out.print("Enter amy letter : ");
        ch = input.next().charAt(0);

        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel");
          } else {
            System.out.println(ch + " is a consonant");
          }



    }
    
}
