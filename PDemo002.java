import java.util.*;
 class Main {
    private String custname;
    private long banknum;
    private Double balance;

    
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the custname: ");
        custname=sc.nextLine();
        System.out.print("Enter the banknum: ");
        banknum=sc.nextLong();
        System.out.print("Enter the balance: ");
        balance=sc.nextDouble();
    }

    void display(){
        System.out.println("Hello "+custname+" Bank account number "+banknum+" Balance "+balance);
    }
 }
 public class PDemo002{

public static void main(String[] args){
    Main sc = new Main();
    sc.input();
    sc.display();
}
 }

