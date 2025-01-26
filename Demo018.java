import java.util.*;

class Demo018{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        long minutes = sc.nextLong();
        long years = minutes / (60 * 24 * 365);
        long remainingDays = (minutes % (60 * 24 * 365)) / (60 * 24);
        System.out.println("Years: "+years+" Days: "+remainingDays);
    }
}
