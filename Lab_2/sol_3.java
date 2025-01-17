package Lab_2;
import java.util.Scanner;
public class sol_3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int m = i.nextInt();
        int years = m/(60*24*365);
        int days = (m - (years*365*24*60))/(60*24);
        System.out.println(m + " is approximately "+years+" years and "+days+" days");
    }

}
