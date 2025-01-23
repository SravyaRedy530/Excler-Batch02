public class LT003 {
    
    // The myAtoi function to convert a string to a 32-bit signed integer
    public int myAtoi(String s) {
        // Remove leading whitespace
        s = s.trim();

        // Edge case: empty string after trimming
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        
        // Check for sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long result = 0;
        
        // Read digits and convert
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            // Check for overflow
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        // Apply sign
        result *= sign;

        // Return the final result after handling overflow
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LT003 solution = new LT003();
        
        // Test cases
        System.out.println(solution.myAtoi("42"));            // Output: 42
        System.out.println(solution.myAtoi("   -042"));       // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));      // Output: 1337
        System.out.println(solution.myAtoi("0-1"));           // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
        System.out.println(solution.myAtoi("21474836460"));   // Output: 2147483647
    }
}