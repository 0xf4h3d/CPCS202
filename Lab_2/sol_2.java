package Lab_2;
import java.util.Scanner;
public class sol_2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = i.nextDouble();
        System.out.print("Enter the tip rate : ");
        double TipRate = i.nextDouble();
        System.out.println("The tip is "+subtotal*(TipRate/100)+" and the total is SAR "+(subtotal+(subtotal*(TipRate/100))) );


        
    }
}
