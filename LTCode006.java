public class LTCode006 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        LTCode006 solution = new LTCode006();

        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.println("Result 1: " + java.util.Arrays.toString(result1));

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.println("Result 2: " + java.util.Arrays.toString(result2));

        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.println("Result 3: " + java.util.Arrays.toString(result3));
    }
}