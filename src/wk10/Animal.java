package wk10;

public class Animal {
    String name;
    int legs;

    public Animal(){}
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public boolean isScary(){
        return legs > 4;
    }

    public void testMethod(){
        System.out.println("test method from Animal");
    }


}
