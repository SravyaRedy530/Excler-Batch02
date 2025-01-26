import java.util.*;

class reverseString {
    void revStr(String str){
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}

class Demo025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        reverseString obj = new reverseString();
        obj.revStr(str);
    }
}
