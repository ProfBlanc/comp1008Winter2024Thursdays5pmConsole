package wk3;

public class Person {
    public String name;
    private int age;

    protected double weight;

    boolean lovesJava;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 120)
            this.age = age;
    }

    public void method1(){}
    protected void method2(){}
    private void method3(){}
    void method4(){}
}
