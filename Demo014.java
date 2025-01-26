import java.util.*;

class Demo014{
    void unary(int a){
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo014 obj = new Demo014();

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        obj.unary(a);
    }
}
    
