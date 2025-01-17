package Lab_2;
import java.util.Scanner;
public class sol_4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter speed and acceleration of the aircraft: ");
        double v = i.nextDouble();
        double a = i.nextDouble();
        System.out.println("The minimum runway length for this aircraft is "+(v*v)/(2*a)); // Math.pow() could be used , printf to round decimals also 
    }
}
