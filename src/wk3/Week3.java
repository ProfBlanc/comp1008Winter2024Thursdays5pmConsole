package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        guessingGame();

    }

    static void guessingGame(){

        //set-up variables
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1, 11);
        int MAX_NUMBER_OF_GUESSES = 3;
        int guessCount = 0;
        boolean won = false;


        System.out.println("Welcome to our Guess Game.\nYou have 3 guesses to guess a number " +
                "between 1 and 10");
        while(guessCount < MAX_NUMBER_OF_GUESSES){
            System.out.printf("Enter guess # %d of %d%n", guessCount + 1, MAX_NUMBER_OF_GUESSES);
            int userGuess = input.nextInt();

            if(userGuess == numberToGuess){
                System.out.println("Congrats! You guessed correctly. The number was " + numberToGuess);
                won = true;
                break;
            }
            else{

                String hint = userGuess < numberToGuess ? "higher" : "lower";
                System.out.printf("Sorry but %d was not the correct number. The number is %s. " +
                                "Please try again.%n",
                        userGuess, hint);

            }

            guessCount++;
        }

        if(!won){
            System.out.println("Sorry, but you did not guess the number in time. The number was " + numberToGuess);
        }

    }
    static void example1(){}
    static void example2(){}
    static void example3(){}
    static void example4(){}
    static void example5(){}
}
