import java.util.Scanner;
public class Ps019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();
        
        // Initialize the first two terms
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");
            
            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}

