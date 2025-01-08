import java.util.Scanner;

public class RoundUpToNearestHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int roundedNumber = ((number + 99) / 100) * 100;

        
        System.out.println("Rounded up to the nearest hundred: " + roundedNumber);
    }
}