package wk10;

public class Cat extends Animal{
    double weight, whiskers;

    public Cat(){}
    public Cat(String name, int legs){
        super(name, legs);
    }
    public Cat(String name, int legs, double weight, double whiskers){
        super(name, legs);
        this.weight = weight;
        this.whiskers = whiskers;
    }

    @Override
    public boolean isScary(){
        return super.isScary() || weight > 200;
    }

    public void isScary(String something){}

    @Override
    public void testMethod(){
        System.out.println("test method from Cat");
    }
}
