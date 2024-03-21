package wk10;

public class Human {

    public String name;
    private int age;
    protected double weight;
    float height;

    public Human(){}

    public Human(String name, int age, double weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String goToSleep(){
        return name + " is going to sleep";
    }
    public String eat(){
        return name + " is eating " + weight/4 + "lbs of food";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
