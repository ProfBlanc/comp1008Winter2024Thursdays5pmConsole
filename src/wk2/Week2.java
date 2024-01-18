package wk2;

import java.util.Scanner;

public class Week2 {

//    public static void main(String[] args){}
  //psvm + tab
public static void main(String[] args) {

    workingWithInputOutputAndDataTypes();
}
static void workingWithInputOutputAndDataTypes(){

    /*
       Output a welcome message
       Ask the user for their name
       Ask the user for their birth year
       Output to screen how old they are in
                years
                months
                weeks
                days

     */
    System.out.println("Welcome to our first program");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = input.nextLine();

    System.out.println("Enter your birth year");
    int birthYear = input.nextInt();

    int year = 2024;
    int yearsOld = year - birthYear;
    int monthsOld = yearsOld * 12;
    int weeksOld = yearsOld * 52;
    int daysOld = yearsOld * 365;

    System.out.println("Hello " + name +"! You are " +yearsOld + " years old. " +
            "In months, that makes " + monthsOld + ". " +
            "In weeks, that makes " + weeksOld + ". " +
            "In days, that makes " + daysOld);

}

/*
        You are a transporter.
        Ask user for a name
        You will ask the user how many kg of metal they want to transport.
        You will ask the user the distance between them and their distination
        Gas price is $1.60. You charge a surplace of 10 cents.
        Your charge per kg of transportation is $20/kg.

        Greet the user and prepare them an invoice

        NAME

        Transporter Rate                    KG requested

        Distance Charge                     Distance Requested

        Subtotal                            Tax
        Grand Total

 */

static void example1(){
    System.out.println("Hello World");


    //sout + tab
    System.out.println("Hello there!");

}
}
