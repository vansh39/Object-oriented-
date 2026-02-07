
class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child ");
        super(); 
        super(); 

    }
}

public class not_super {
    public static void main(String[] args) 
        Child obj = new Child();
    }
} {
    
}
