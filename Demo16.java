import java.util.Scanner;
public class Demo016 {

    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String name=scanner.nextLine();

        if(isPalindrome(name)){
            System.out.println("\"" + name + "\" is a palindrome.");
        } else {
            System.out.println("\"" + name + "\" is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Compare characters from the start and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // If mismatch is found, not a palindrome
            }
            start++;
            end--;
        }
        return true;  // If all characters match, it's a palindrome
    }
}


