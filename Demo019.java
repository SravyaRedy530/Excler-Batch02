import java.util.*;
class Demo019{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n=sc.nextInt();
        Demo019 d = new Demo019();
        d.getFibonacciSeries(n);
    }
    void getFibonacciSeries(int n){
        System.out.println("Fibonacci series: ");
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
