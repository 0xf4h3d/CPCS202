/*
Course : CPCS 202
Name : fahad almarhabi
University ID : 2436118
Section : CS3
Name of lab instructor : waseem
Problem number : 1020
Assignment number : #1
Beecrowd id : 1046978
*/

import java.util.Scanner;
public class lab_4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int y = n / 365;
        int m = (n - (y*365)) / 30 ;
        int d = (n - (y*365) - (m*30));
        System.out.println(y+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
        
    }
}
