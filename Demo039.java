import java.util.Scanner;
public class Demo039 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name="Bro code";

    System.out.print("Enter a single character: ");
    char Char = sc.next().charAt(0);

    if(Character.isLowerCase(Char)){
        System.out.println("The character is a lower case");
    }else if(Character.isUpperCase(Char)){
        System.out.println("The character is a upper case");
    }else if(Character.isDigit(Char)){
        System.out.println("The character is a digit"); 
    }


    }
}
