package wk5;

//javadoc   =>   /**            */

/**
 * Describe the Pizza Order class with as much details as you'd like
 * @author Ben Blanc
 * @since 2024-02-08
 * @implNote How to implement this class
 */
public class PizzaOrder {

    /** This is the official documentation for this instance variable */
    public String test;
    public static final String OWNER = "Business Owner";
    public static final int SINCE = 1999;

    public static PizzaOrder MediumWalkInSpecial(){
        return new PizzaOrder(PizzaSizes.MEDIUM, "cheese,pepperoni");
    }
    /**
     * This is how you can get a contact number
     * @param country The country that you are calling from
     * @return The phone number that you can call
     */

    public static final String getContactPhoneNumber(String country){

        return switch (country){
            case "USA", "United States" -> "18881234567";
            case "Canada", "canada" -> "4161234567";
            default -> "18001234567";
        };
    }
    //enum: drop-down menu of pre-set options
    // enum: enumerable. A list of constant values
    // enum NameOfDropDownOfValues {VALUES, ALL, IN , UPPERCASE}
    enum PizzaSizes {PERSONAL, SMALL, MEDIUM, LARGE, EXTRA_LARGE}
    //private String pizzaSize;
    private PizzaSizes pizzaSize;
    private int slices;
    private double price, discount=1;
    private String toppings;
    private int numberOfToppings;


    //create the getters and setters for all private instance variables
    //right-click => Generate => Getters and Setters
    // select all instance variables

    public PizzaSizes getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSizes pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices() {
            //enhance switch statement
        /*
         object =       switch(value){

                case VALUE -> return a value

                }
         */


        this.slices = switch (pizzaSize){
            case PERSONAL -> 4;
            case MEDIUM -> 8;
            case SMALL -> 6;
            case LARGE -> 10;
            default -> 12;
        };
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        //you to devise some sort of pricing algorithm
        // base price + number of toppings + number of slices;
        double basePrice = 3.5;
        this.price = basePrice + (numberOfToppings * slices);
        this.price *= discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(String person) {
        if(person.equalsIgnoreCase("student"))
            discount =  0.8;
        else if(person.equalsIgnoreCase("elder")) {
            discount = 0.5;
        }
        else
            discount = 1;

    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {

        //toppings will be comma seperated
        //cheese,pepperoni,bacon
        //split(",")  => array of Strings
        //create an array that list your 5 allowed toppings
        // iterate through all allowed toppings & toppings requested
        // strip out/ remove all toppings that are NOT in your allowed toppings list

        String filteredToppings = "";
        //allowed toppings
        String[] allowedToppings = {"cheese", "pepperoni", "bacon", "pineapple", "chicken"};
        for(String allowedTopping : allowedToppings){
            //argument toppings
            for(String topping : toppings.split(",")){
                //append allowed toppings to your filtered toppings variable
                if(topping.equalsIgnoreCase(allowedTopping)){
                    filteredToppings += topping + '\t';
                    numberOfToppings++;
                }
                }
        }

        this.toppings = filteredToppings;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public PizzaOrder(PizzaSizes pizzaSize, String toppings) {
        setPizzaSize(pizzaSize);
        setToppings(toppings);
        setSlices();
        setPrice();

   }

   //alt+insert

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "pizzaSize=" + pizzaSize +
                ", slices=" + slices +
                ", toppings='" + toppings + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", price=" + price +
                '}';
    }
}
