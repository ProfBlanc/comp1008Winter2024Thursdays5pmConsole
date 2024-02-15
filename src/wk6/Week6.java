package wk6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        example2();
    }
    static void example1(){

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>(5);

        //add(), remove(), indexOf(), size(), clear(), contains()
        //add(EXACT data type)
        //add(index, data)
        //remove(value), remove(int index)
        //indexOf(value)
        //size() number of values
        // contains(value)  if value is in the arraylist
        doubles.add(1d);

    }
    static void example2(){
        //Create an arraylist of 10 SHORT values
        //10 random numbers between -100 and 100 (inclusive)
        //ask the user for a number
        //determine if the number is found in the arraylist
            //Yes: output the index
            // NO: sorry msg
        //be back at 17:32

        //
        int numberOfValues = 10;
        ArrayList<Short> arrayList = new ArrayList<>(numberOfValues);
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        short userGuess;

        for(int i = 0 ; i < numberOfValues; i++){
            arrayList.add( (short) random.nextInt(-100, 101)  );
        }

        System.out.println("Enter a number to guess");
        userGuess = input.nextShort();

        if(arrayList.contains(userGuess)){
            System.out.printf("The number %d was found at index %d%n",
                    userGuess, arrayList.indexOf(userGuess));
        }
        else{
            System.out.println("Sorry but that number was not found");
        }
    }
    static void example3(){}
    static void example4(){}
    static void example5(){}
}
