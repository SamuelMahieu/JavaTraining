package Section7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("Please type your password: ");
            password = input.nextLine();

        }while (!password.equals("shark50"));
       System.out.println("ACCESS APPROVED");

    }
}
