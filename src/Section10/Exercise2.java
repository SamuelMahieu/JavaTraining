package Section10;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String [] questions = {"Is the president of the USA is Donald Trump:","Is 2 greater than one?","Is it true that you're above 30?",
        "Do you think it's true that you're tall?","Do you feel happy?"};
        Boolean [] answers = {false,true,true,false,true};
        Boolean [] usersAnswers = new Boolean[5];
        Scanner scanner = new Scanner(System.in);
        int results = 0;

        System.out.println("Please answer the questions with 'true' or 'false");
        for(int i=0;i<5;i++){
            System.out.println(questions[i]);
            usersAnswers [i]= scanner.nextBoolean();
            if(usersAnswers[i] == answers[i]){
                results++;
            }
        }
        if(results>2){
            System.out.println("Congratulation you have passed the test!");
        }else{
            System.out.println("Sorry but you didn't pass the test :(");
        }

    }
}
