package wk5;

public class Week5 {

    //psvm + tab
    public static void main(String[] args) {
        example2();

    }

    static void example2(){
        System.out.println(PizzaOrder.OWNER);
        System.out.println(PizzaOrder.getContactPhoneNumber("caanda"));

        PizzaOrder walkInSpecial = PizzaOrder.MediumWalkInSpecial();
        System.out.println(walkInSpecial);

    }
    static void example1(){
        // PizzaOrder pizzaOrder = new PizzaOrder();
        //then be able to run the following statement
        PizzaOrder pizzaOrder = new PizzaOrder(PizzaOrder.PizzaSizes.EXTRA_LARGE,
                "bacon,ground beef,cheese,chicken");
        //apply a student discount
        pizzaOrder.setDiscount("student");
        //output the price, number of toppings, get the toppings
        System.out.println(pizzaOrder.getPrice()); // gives me price

    }
}
