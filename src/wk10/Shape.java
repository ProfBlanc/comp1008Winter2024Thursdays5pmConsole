package wk10;

public abstract class Shape {

    String name;
    int sides;

    public Shape(){}
    public Shape(String name, int sides){
        this.name = name;
        this.sides = sides;
    }
    //abstract methods
    public abstract int perimeter();

    public abstract double area();
}
