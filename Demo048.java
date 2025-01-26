import java.util.Scanner;

public class Demo048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,i=0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n!=0){
            r=n%10;
            i = i+r;//adding
            n = n/10;
        }
        System.out.println("sum of the number is "+i);
    }
}