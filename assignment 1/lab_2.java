/*
Course : CPCS 202
Name : fahad almarhabi
University ID : 2436118
Section : CS3
Name of lab instructor : waseem
Problem number : 1009
Assignment number : #1
Beecrowd id : 1046978
*/
import java.util.Scanner ;
public class lab_2 {
 
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String name = i.nextLine();
        double salary = i.nextDouble();
        double sales = i.nextDouble();
        double total = salary + (sales*0.15); 
        System.out.printf("TOTAL = R$ %.2f%n",total);
   
    }
}
