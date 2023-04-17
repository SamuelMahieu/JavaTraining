package Section10;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int numberOfStudents;
        double maximumScore;
        int sum =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Students please:");
        numberOfStudents = input.nextInt();
        double [] results = new double[numberOfStudents];

        System.out.println("Please enter the maximum score:");
        maximumScore = input.nextDouble();

        for (int i=0;i<numberOfStudents;i ++){
            System.out.format("Please enter the exam result for Student %d:\n",i+1);
            results[i]= input.nextDouble();
            sum+=results[i];
        }
        System.out.println("The average score is: "+(sum/numberOfStudents));
        System.out.println("The percentage is "+(sum/results.length));


    }
}
