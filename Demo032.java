import java.util.HashSet;

public class Demo032 {
    public static void main(String[] args) {
        
        HashSet<String> stringSet = new HashSet<>();

        
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Mango");

        
        stringSet.add("Apple");  
        
        System.out.println("HashSet contents: " + stringSet);

        
        if (stringSet.contains("Banana")) {
            System.out.println("Banana is present in the HashSet.");
        }

        
        stringSet.remove("Cherry");
        System.out.println("After removing Cherry: " + stringSet);

        
        System.out.println("Iterating through HashSet:");
        for (String item : stringSet) {
            System.out.println(item);
        }
}
}