import java.util.*;

public class Demo009 {
    private String custname;
    private long bankaccno;
    private Double balance;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        custname = sc.next();
        System.out.print("Enter your account number: ");
        bankaccno = sc.nextLong();
        System.out.print("Enter bank balance: ");
        balance = sc.nextDouble();
        Demo009 obj = new Demo009();
    }

    void display(){
        System.out.println("Hello "+custname+"\nBank account number: "+bankaccno+"\nBalance: "+balance);
    }
    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.input();
        obj.display();
    }
}