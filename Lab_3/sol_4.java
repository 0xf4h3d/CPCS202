package Lab_3;
import java.util.Scanner;
public class sol_4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Enter two characters : ");
        String input = i.nextLine();

        char m = input.charAt(0);
        char c = input.charAt(2);

        String major = "";
        String city = "";

        switch (m) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
                break;
            default:
                System.out.println("Invalid major code.");
                return;
        }

        switch (c) {
            case 'J':
                city = "Jeddah";
                break;
            case 'M':
                city = "Mecca";
                break;
            case 'T':
                city = "Taif";
                break;
            case 'R':
                city = "Riyadh";
                break;
            case 'O':
                city = "Other";
                break;
            default:
                System.out.println("Invalid city code.");
                return;
        }
        System.out.println(major + " from " + city);
    }
}
