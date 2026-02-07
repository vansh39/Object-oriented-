class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 200;

    void display() {
        System.out.println("Value using this: " + this.value);
        System.out.println("Value using super: " + super.value);
    }
}

public class Keywords {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
