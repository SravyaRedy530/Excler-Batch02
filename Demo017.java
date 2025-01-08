import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        
        // Get the tens and ones place digits
        int tens = number / 10;  // Extract the tens digit
        int ones = number % 10;  // Extract the ones digit
        
        // Calculate the sum of the digits
        int sum = tens + ones;
        
        // Print the equation and the result
        System.out.println(tens + " + " + ones + " = " + sum);
        
        }
}