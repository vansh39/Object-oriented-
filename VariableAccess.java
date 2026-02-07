public class VariableAccess {
    int number = 42;  
    public static void main(String[] args) {
        VariableAccess obj = new VariableAccess(); 
        System.out.println("Accessed variable: " + obj.number);
    }
}
