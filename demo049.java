import java.util.Scanner;
public class demo049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;     
            reversed = reversed * 10 + digit;  
            number = number / 10;         
        }
        System.out.println("The reversed number is: " + reversed);
        scanner.close();
    }
}


