import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }

        System.out.println("\nEntered strings:");
        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }

        sc.close();
    }
}