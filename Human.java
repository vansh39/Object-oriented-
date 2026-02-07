class Person {
    int age;
    String name;
    
}
public class Human {
    public static void main (String[] args) {
        Person p1 = new Person();
        p1.age = 25;
        p1.name = "John";
        System.out.println("Name: " + p1.name + ", Age: " + p1.age);
    }
}
