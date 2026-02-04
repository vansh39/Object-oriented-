class Parent {
    Parent() {
        super();
        System.out.println("Parent constructor");
    }
}
class Child extends Parent {
    Child() {
        super();    
        System.out.println("Before super");                           
    }
}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
    }
}