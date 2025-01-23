import java.util.Scanner;

public class Demo038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); 

        if (Character.isLowerCase(character)) {
            System.out.println(character + " is lowercase.");
        } else if (Character.isUpperCase(character)) {
            System.out.println(character + " is uppercase.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }

        scanner.close();
    }
}
