package LT001;
public class LT007 {
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;  
                    return digits;
                }
                digits[i] = 0;  
            }
            int[] result = new int[n + 1];
            result[0] = 1;  
            return result;
        }
        public static void main(String[] args) {
            LT007 solution = new LT007();
            int[] digits1 = {1, 2, 3};
            int[] result1 = solution.plusOne(digits1);
            System.out.print("Output for [1, 2, 3]: ");
            for (int digit : result1) {
                System.out.print(digit + " ");
            }
            System.out.println();
            int[] digits2 = {4, 3, 2, 1};
            int[] result2 = solution.plusOne(digits2);
            System.out.print("Output for [4, 3, 2, 1]: ");
            for (int digit : result2) {
                System.out.print(digit + " ");
            }
            System.out.println();
            int[] digits3 = {9};
            int[] result3 = solution.plusOne(digits3);
            System.out.print("Output for [9]: ");
            for (int digit : result3) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
    

