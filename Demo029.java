import java.util.*;

class Demo029{
    ArrayList<String> list = new ArrayList<String>();
    void Add(String name){
        list.add(name);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.print("Enter the "+(i+1)+" person name: ");
            String name = sc.next();
            Add(name);
        }
    }
    void display(){
        for(String name: list){
            System.out.println(name);
        }
    }
    public static void main(String[] args){
        Demo029 obj = new Demo029();
        obj.input();
        System.out.println("\nNames are: ");
        obj.display();
    }
}
