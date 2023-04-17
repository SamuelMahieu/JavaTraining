package Section7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise5 {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        Scanner input = new Scanner(System.in);
        int reply;
        System.out.println(randomNumber);
        do {
            System.out.println("Guess a number between 1 and 100: ");
            reply = input.nextInt();
            if(reply < randomNumber){
                System.out.println("HIGHER");
            }else if(reply > randomNumber){
                System.out.println("LOWER");
            }else {
                System.out.println("CORRECT");
            }
        }while (reply != randomNumber);
    }
}
