package LT001;
public class LT002 {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check for overflow/underflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // underflow
            }

            reversed = reversed * 10 + digit;
        }

        return sign * reversed;
    }

    public static void main(String[] args) {
        LT002 solution = new LT002();
        
        // Test the reverse method with some example inputs
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;
        int x4 = 0;
        
        System.out.println(solution.reverse(x1)); // Expected: 321
        System.out.println(solution.reverse(x2)); // Expected: -321
        System.out.println(solution.reverse(x3)); // Expected: 21
        System.out.println(solution.reverse(x4)); // Expected: 0
    }
}
