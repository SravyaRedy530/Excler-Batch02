import java.util.*;
 class PDemo001 {
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
        System.out.println("Hello "+custname+"\nBank account number: "+banknum+"\nBalance: "+balance);
    }

public static void main(String[] args){
    PDemo001  sc = new PDemo001();
    sc.input();
    sc.display();
}
 }
