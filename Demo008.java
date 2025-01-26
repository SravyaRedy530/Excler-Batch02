import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String loginid=" ";
        String password=" ";
        String reply;
        
        do{
            System.out.println("Mallareddy University");
            System.out.println("have you visited our site earlier");
            reply=scanner.nextLine();
        
        if(reply == "no"){
            System.out.println(" enter login id");
            System.out.println("enter user id and password");
            loginid=scanner.nextLine();
            password=scanner.nextLine();
        }
        else{
            System.out.println("you are our valued customer");
        }
    }
    while(loginid=="Sravya" && password=="sravyareddy123");

        
    
}
    }

