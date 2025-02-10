import java.util.Scanner;
public class Demo059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2;i<=num/2;i++){
            if (num % i == 0) {
                return false;
            }
        }return true;
    }
}
