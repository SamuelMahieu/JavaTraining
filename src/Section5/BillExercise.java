package Section5;

import java.util.Scanner;

public class BillExercise {
    public static void main(String [] args){
        int numberOfPerson;
        double totalAmount;
        Scanner input = new Scanner(System.in);
        System.out.println("How much is the total amount?");
        totalAmount = input.nextDouble();
        System.out.println("How many people to split with?");
        numberOfPerson = input.nextInt();

        System.out.format("Each person should pay %.2f",(totalAmount/numberOfPerson));
    }
}
