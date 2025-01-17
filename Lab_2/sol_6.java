package Lab_2;
import java.util.Scanner;
public class sol_6 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Please enter your full name : ");
        String name = i.nextLine();
        System.out.print("Sex : ");
        String sex = i.nextLine();
        System.out.println("A reservation has been made for the following guest : \n\t"+name + " ("+sex+")");
    
    }
}
