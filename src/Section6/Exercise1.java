package Section6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int x ;
        int y ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        x = input.nextInt();
        System.out.print("Please enter a second number: ");
        y = input.nextInt();
        if(x>y){
            System.out.println("First number is bigger than the second");
        } else if (x<y) {
            System.out.println("Second number is bigger than the first one");
        }
        else {
            System.out.println("The numbers are equals");
        }

    }
}
