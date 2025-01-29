public class Demo054.java {
 static int currentBalance = 1000;
 
 public static void gretings() {
	 System.out.println("Hello Welcome To !");
 }
 
 
 public void deposit(int amount) {
	 currentBalance = currentBalance + amount;
	 System.out.println("Amount Deposited Successfully");
 }
public static void withdrawal(int amount) {
	currentBalance = currentBalance - amount;
	System.out.println("Amount Withdrawal Successfully");
 }

public int getCurrentBalance() {
	 return currentBalance; 
}

public class Main{

 public static void main(String[] args) {
	 Demo054 methods = new Demo054();
	 System.out.println("Current Balance is:"+methods.getCurrentBalance());
	 methods.deposit(500);
	 System.out.println("Current Balance is:"+methods.getCurrentBalance());
	 System.out.println("Current Balance is:"+methods.getCurrentBalance());
}
}
}

