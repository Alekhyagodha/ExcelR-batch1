import java.util.Scanner;
public class Demo034 {
   

public class EvenOddCheck {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

}
