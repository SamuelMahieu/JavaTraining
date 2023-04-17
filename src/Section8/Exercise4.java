package Section8;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String foods [] = new String [3];
        int i = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter your top 5 food here please: ");
            foods[i]= input.nextLine();
            i++;
        }while (i<3);

        System.out.println("No more memory!");
        System.out.println("Here's your top 3 favorite food");

        for (String food: foods) {
            System.out.println(food);
        }

    }
}
