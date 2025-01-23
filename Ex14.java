import java.util.*;
class Person{
    private String name;
    private int age;
    Person(String name,int age)
    {
       this.name=name;
       this.age=age;

    }
    Person()
    {
        this("Rajesh",20);
        System.out.println("in default constuctor");
    }
    void display()
    {
        System.out.println("the name is "+name);
        System.out.println("the age is "+age );
    }
}
public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.display();
    }
}