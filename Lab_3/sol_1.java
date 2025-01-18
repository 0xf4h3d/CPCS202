package Lab_3;
public class sol_1 {
    public static void main(String[] args) {
        int min =-20,max=20;
        double random1 = min + Math.random() * (max - min);
        System.out.println("First Number : "+random1);
        double random2 = min + Math.random() * (max - min);
        System.out.println("Second Number : "+random2);
        if (random1 > random2){
            System.out.println("The largest number is : "+ random1);
        }else{System.out.println("The largest number is : "+ random2);}

        
    }
}
