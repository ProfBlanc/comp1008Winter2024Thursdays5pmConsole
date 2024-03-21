package wk10;

public class Week10 {


    static void example1(){
        Human h1 = new Human("Bruce Wayne", 30, 220, 180);
        Superhero sh1 = new Superhero();
        System.out.println(sh1);
        Superhero sh2 = new Superhero("Batman", 20, 250, 190);

        System.out.println(h1);
        System.out.println(sh2);

    }
    static void example2(){}
    public static void main(String[] args) {
        example1();
    }
}
