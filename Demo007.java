import java.util.*;

public class Demo007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, age, phone number: ");
        String name= sc.next();
        String age=sc.next();
        String num = sc.next();
        System.out.println("Hello "+name+", age = "+age+", phone number: "+num);
    }
}
