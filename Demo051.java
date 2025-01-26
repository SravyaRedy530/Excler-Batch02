import java.util.Scanner;

public class Demo051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,rev=0,b;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        b = n;
        while(n!=0){
            r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        if(rev == b){
            
            System.out.print(+b+" is a palindrome");
        }else{
            System.out.print(+b+" is a not palindrome");
        }
       
    }
}