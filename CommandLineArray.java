public class CommandLineArray {
    public static void main(String[] args) {
        System.out.println("Array elements from command line:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
