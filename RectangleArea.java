import java.util.Scanner; // Import Scanner class for user input

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Calculate the area
        double area = length * width;
        
        // Display the result
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
