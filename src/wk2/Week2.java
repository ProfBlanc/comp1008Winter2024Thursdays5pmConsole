package wk2;

import java.util.Scanner;

public class Week2 {

//    public static void main(String[] args){}
  //psvm + tab
public static void main(String[] args) {

   // workingWithInputOutputAndDataTypes();
    task1();
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
        You will ask the user the distance between them and their destination
        Gas price is $1.60. You charge a surcharge of 10 cents.
        You charge per kg of transportation is $20/kg.
        You charge gas price + surcharge per kilometer
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

static void task1(){

    Scanner input = new Scanner(System.in);
    double distanceRate = 1.7;
    double weightRate = 20;


    System.out.println("I am a transporter");
    System.out.println("Enter name");
    String name = input.nextLine();
    System.out.println("Enter the amount of metal you want to transport");
    double amount = input.nextDouble();
    System.out.println("Enter the distance");
    double distance = input.nextDouble();

    double priceWeight = amount * weightRate;
    double priceDistance = distance * distanceRate;
    double subTotal = priceDistance + priceWeight;
    double tax = subTotal * 0.13;
    double grandTotal = subTotal + tax;

    /*
            %symbol
                %s      string
                %d      digit (whole number)
                %f      float (double/fload)
                %n      new line char
     */
    System.out.printf("Hello %s. You entered " +
            "%f as distance and %.1f as weight. " +
            "The price for distance is %.2f. " +
            "The price for weight is %.0f. " +
            "The sub total is %.2f. " +
            "The tax is %.2f. " +
            "The grand total is %.2f",
            name, distance, amount,
            priceDistance, priceWeight, subTotal, tax,
            grandTotal
            );
}


    // ask the user to guess a number between 1 and 10
    // limit their attempts to 3 attempts
    // on each attempt, if incorrect. Hint: higher or lower
    // if correct, congratulate user
    // if user does not correctly guess number, tell them to study more

}
