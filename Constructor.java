class Student {
    String name;
    Student(String n) {
        name = n;
        System.out.println("Constructor Name = " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Vansh"); 
    }
}
