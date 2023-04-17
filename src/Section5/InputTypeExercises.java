package Section5;

import java.util.Scanner;

public class InputTypeExercises {
    public static void main (String [] args){
        int age;
        double height;
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        name = input.next();
        System.out.println("How old are you?");
        age = input.nextInt();
        /*
        System.out.println("How tall are you in cm?");
        height = input.nextDouble();

        System.out.println("Your name is "+name+" you're "+age+" and your size is "+height+" cm.");
        double averageMaleHeightDifference = height-1.75;
        double averageFemaleHeightDifference = height - 1.62;
        System.out.println("The difference between your height and the average");
        System.out.format("%.2fm if you're a male.\n",averageMaleHeightDifference);
        System.out.format("%.2fm if you're a female.\n",averageFemaleHeightDifference);

        System.out.format("Your name is %s,  you're %d and your size is %.2fm compare to the average if you're a male or " +
                "%.2fm if you're a woman.",name,age,averageMaleHeightDifference,averageFemaleHeightDifference);

         */
        System.out.format("You lived %d years. In another %d years you'll be %d years old.\n",age,age,(age*2));
        System.out.format("Your name contains %d characters",name.length());


    }
}
