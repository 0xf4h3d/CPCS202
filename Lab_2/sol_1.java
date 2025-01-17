package Lab_2;
import java.util.Scanner;
public class sol_1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number in pounds : ");
        double pounds = i.nextDouble();
        System.out.println(pounds + " pounds is "+pounds*0.454+" kilograms");
    }
}
