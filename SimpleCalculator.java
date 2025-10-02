import java.util.Scanner;

public class SimpleCalculator {

    // Function to perform calculation
    public static void calculate(int a, int b, char operator) {
        int result = 0;

        if (operator == '+') {
            result = a + b;
            System.out.println("Result = " + result);
        } 
        else if (operator == '-') {
            result = a - b;
            System.out.println("Result = " + result);
        } 
        else if (operator == '*') {
            result = a * b;
            System.out.println("Result = " + result);
        } 
        else if (operator == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        } 
        else if (operator == '%') {
            result = a % b;
            System.out.println("Result = " + result);
        } 
        else {
            System.out.println("Invalid Operator!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            // call function
            calculate(num1, num2, op);

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed. Thank you!");
        sc.close();
    }
}
