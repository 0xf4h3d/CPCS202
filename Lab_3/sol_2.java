package Lab_3;
import java.util.Scanner;
public class sol_2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a lowercase English letter : ");
        String x = i.nextLine();
        if ( "aeiou".contains(x) ){
            System.out.println(x+" is a vowel");
        }else if ("qwrtypsdfghjklzxcvbnm".contains(x)){
            System.out.println(x+" is not a vowel");
        }else{System.out.println(x+" is not a lowercase letter");}
    }
}
