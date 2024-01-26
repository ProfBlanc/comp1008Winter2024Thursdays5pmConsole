package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
       // guessingGame();
        example5();
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
    static void example1(){

        Car car = new Car();
        car.move();
        System.out.println(car.currentSpeed);
        car.move(50);
        System.out.println(car.currentSpeed);

    }
    static void example2(){

        Laptop laptop = new Laptop();
        laptop.powerOn = true;
        laptop.batteryPercentage = 90.5;
        laptop.ram = 32;
        laptop.displaySize = new int[]{123, 455};
        System.out.println(laptop.color);
        laptop.color = Laptop.ColorsAvailable.SILVER;
        System.out.println(laptop.color);
    }
    static void example3(){
        Laptop l1 = new Laptop(200);
        Laptop l2 = new Laptop(90d, 300);
        Laptop l3 = new Laptop();

    }
    static void example4(){

       String[] names = new String[5];
        System.out.println(names[4]);
        System.out.println(names.length);   // 5, highest index length -1

        int[] nums = new int[5];
        System.out.println(nums[3]);

        nums[2] = 1234;

        Object[] values = {names[0], nums[2], true, "boo", 1.1};
        System.out.println(values.length);

        System.out.println(values[0]);





    }
    static void example5(){

        /*
                mon         tues                wed

                wake up     go to school        study
                eat         sleep               exercise

         */

        String[][] schedule1 = new String[3][2];
        schedule1[0][0] = "wake-up";
        schedule1[0][1] = "eat";
        schedule1[1][0] = "go to school";
        schedule1[1][1] = "sleep";
        schedule1[2][0] = "study";
        schedule1[2][1] = "exercise";

        String[][] schedule2 = { {"wake-up", "eat"},
                {"go to school", "sleep"},
                {"study", "exercise"}
        };

        for(int i= 0; i < schedule2.length; i++){
            for(int j = 0; j < schedule2[i].length; j++){
                System.out.println(schedule2[i][j]);
            }
        }

    }
}
