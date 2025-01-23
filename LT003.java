package LT001;
public class LT003 {
        public int myAtoi(String s) {
            s = s.trim();
            if (s.length() == 0) {
                return 0;
            }
    
            int i = 0;
            long num = 0;
            int sign = 1;
    
            
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                sign = (s.charAt(i++) == '-') ? -1 : 1;
            }
    
        
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i++) - '0';
    
                
                if (num > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
    
                num = num * 10 + digit;
            }
    
            return (int) (sign * num);
        }
    
        
            public static void main(String[] args) {
            LT003 solution = new LT003();
    
            
            System.out.println(solution.myAtoi("42"));            
            System.out.println(solution.myAtoi("   -42"));        
            System.out.println(solution.myAtoi("4193 with words")); 
            System.out.println(solution.myAtoi("words and 987"));   
            System.out.println(solution.myAtoi("-91283472332"));   
            System.out.println(solution.myAtoi("  +00123"));        
        }
    }
    

