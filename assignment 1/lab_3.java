/*
Course : CPCS 202
Name : fahad almarhabi
University ID : 2436118
Section : CS3
Name of lab instructor : waseem
Problem number : 1021
Assignment number : #1
Beecrowd id : 1046978
*/

import java.util.Scanner;

public class lab_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        scanner.close();     
        int cents = (int) Math.round(value * 100);
        int[] notes = {100, 50, 20, 10, 5, 2};
        int[] coins = {100, 50, 25, 10, 5, 1};
        System.out.println("NOTAS:");
        for (int note : notes) {
            int quantity = cents / (note * 100);
            System.out.println(quantity + " nota(s) de R$ " + note + ".00");
            cents %= (note * 100);
        }
        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int quantity = cents / coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantity, coin / 100.0);
            cents %= coin;
        }
    }
}
