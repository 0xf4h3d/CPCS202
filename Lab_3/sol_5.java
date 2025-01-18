package Lab_3;
import java.util.Scanner;
public class sol_5 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        Double bal = i.nextDouble();
        
        if (x % 5 == 0 && x <= bal-0.5){
            System.out.println("Successfull transcation , Balance is : "+(bal-x-0.5));

        }else if ( x % 5 != 0 ){System.out.println("Incorrect Withdrawal Amount (not multiple of 5)");}

        else{System.out.println("Insufficient Funds");}}
        
    }
