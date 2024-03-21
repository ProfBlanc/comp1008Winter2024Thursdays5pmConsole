package wk10;

public class Rectangle extends Shape{

    int length, width;
    @Override
    public int perimeter(){
        return 2 * (length + width);
    }

    @Override
    public double area(){
        return length * width;
    }
}
