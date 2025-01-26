import java.util.*;

class FizzBizz{
    void FizzBizz1(int i){
        
        if(i%3!=0&&i%5!=0){
            System.out.println(String.valueOf(i));
        }else if(i%3==0&&i%5==0){
            System.out.println("FizzBuzz");
        }else if(i%3==0&&i%5!=0){
            System.out.println("Fizz");
        }else if(i%3!=0&&i%5==0){
            System.out.println("Buzz");
        }
    }
}
class Demo020{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        FizzBizz obj = new FizzBizz();
        obj.FizzBizz1(n);
    }
}
