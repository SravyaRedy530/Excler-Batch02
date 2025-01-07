import java.util.Scanner;
public class Areaoftriangle {
    

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area using the formula: Area = (base * height) / 2
        double area = 0.5 * base * height;

        // Output the result
        System.out.println("The area of the triangle is: " + area);
    }
}

    

