import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);  // Corrected line
        System.out.println("Ankit Dharmendra Singh");
        String name = input.nextLine();

        System.out.println("My name is " + name);
    }
}