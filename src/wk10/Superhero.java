package wk10;

public class Superhero extends Human{

    String heroName, heroPower;
    double strength;


    public Superhero(){}

    public Superhero(String name, int age, double weight, float height){

        super(name, age, weight, height);

    }
    public Superhero(Human human, String heroName, String heroPower, double strength){
        super(human.name, human.getAge(), human.weight, human.height);
        this.heroName = heroName;
        this.heroPower = heroPower;
        this.strength = strength;
    }
    public String fight(String opponent){
        name = "a";
        weight = 123;
        height = 456;
        //age = 10;
        return heroName + " is fighting " + opponent;
    }

    @Override  // annotation => speaks to compiler to ask it to verify method signatures are same\
    public String toString(){
        int lastChar = super.toString().length() - 1;
        return "Superhero" + super.toString().substring(5, lastChar)
                + String.format(",Hero Name = %s, Super Power = %s, Strength = %.0f",
                heroName, heroPower, strength
                )
                ;
    }

}
