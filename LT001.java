package LT001;

public class LT001 {
                 public boolean isPalindrome(int x) {
                    // If the number is negative, it's not a palindrome
                    if (x < 0) {
                        return false;
                    }
            
                    int reversenum = 0;
                    int y = x;
            
                    while (x > 0) {
                        int remainder = x % 10;
                        reversenum = reversenum * 10 + remainder;
                        x = x / 10;
                    }
            
                    // Check if the original number is equal to its reverse
                    return y == reversenum;
                }
            
                public static void main(String[] args) {
                    LT001 solution = new LT001();
                    
                    // Test the isPalindrome method with some example inputs
                    int number1 = 121;
                    int number2 = -121;
                    int number3 = 10;
            
                    System.out.println("Is " + number1 + " a palindrome? " + solution.isPalindrome(number1)); // Expected: true
                    System.out.println("Is " + number2 + " a palindrome? " + solution.isPalindrome(number2)); // Expected: false
                    System.out.println("Is " + number3 + " a palindrome? " + solution.isPalindrome(number3)); // Expected: false
                }
            }
            