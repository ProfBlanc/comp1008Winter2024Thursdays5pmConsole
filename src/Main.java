import wk3.Person;
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getAge());
        p.setAge(100);
        System.out.println(p.getAge());
        p.setAge(-10);
        System.out.println(p.getAge());
        p.setAge(50);
        System.out.println(p.getAge());
    }
}